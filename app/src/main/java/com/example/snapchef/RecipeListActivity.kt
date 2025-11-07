package com.example.snapchef

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class RecipeListActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recipeAdapter: RecipeAdapter
    private lateinit var chipGroup: ChipGroup
    private lateinit var tvResultCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_list)

        val ingredients = intent.getStringArrayListExtra("ingredients") ?: arrayListOf()

        setupViews(ingredients)
        loadRecipes(ingredients)
    }

    private fun setupViews(ingredients: List<String>) {
        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        chipGroup = findViewById(R.id.chipGroup)
        tvResultCount = findViewById(R.id.tvResultCount)
        recyclerView = findViewById(R.id.recyclerView)

        btnBack.setOnClickListener {
            finish()
        }

        recyclerView.layoutManager = LinearLayoutManager(this)

        // Display detected ingredients as chips
        if (ingredients.isNotEmpty()) {
            ingredients.forEach { ingredient ->
                val chip = Chip(this)
                chip.text = ingredient
                chip.isClickable = false
                chip.isCheckable = false
                chipGroup.addView(chip)
            }
        }
    }

    private fun loadRecipes(ingredients: List<String>) {
        val allRecipes = listOf(
            Recipe("Spaghetti Carbonara", "Classic Italian pasta dish", "...", listOf("Pasta", "Eggs", "Bacon", "Cheese")),
            Recipe("Chicken Tikka Masala", "Creamy and flavorful curry", "...", listOf("Chicken", "Yogurt", "Tomatoes", "Spices")),
            Recipe("Caesar Salad", "A green salad and croutons dressed with lemon juice, olive oil, egg, Worcestershire sauce, anchovies, garlic, Dijon mustard, Parmesan cheese, and black pepper.", "...", listOf("Lettuce", "Croutons", "Parmesan Cheese", "Chicken"))
        )

        val recipes = if (ingredients.isEmpty()) allRecipes else allRecipes.filter { recipe -> recipe.ingredients.any { it in ingredients } }

        tvResultCount.text = if (ingredients.isEmpty()) {
            "All Recipes (${recipes.size})"
        } else {
            "Found ${recipes.size} recipes with your ingredients"
        }

        recipeAdapter = RecipeAdapter(recipes) { recipe ->
            openRecipeDetail(recipe)
        }

        recyclerView.adapter = recipeAdapter
    }

    private fun openRecipeDetail(recipe: Recipe) {
        val intent = Intent(this, RecipeDetailActivity::class.java)
        intent.putExtra("recipe", recipe)
        startActivity(intent)
    }
}