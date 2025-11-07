package com.example.snapchef

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class RecipeDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_detail)

        val recipe = intent.getSerializableExtra("recipe") as? Recipe

        if (recipe != null) {
            setupViews(recipe)
        } else {
            finish()
        }
    }

    private fun setupViews(recipe: Recipe) {
        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        val imgRecipeDetail = findViewById<ImageView>(R.id.imgRecipeDetail)
        val tvRecipeName = findViewById<TextView>(R.id.tvRecipeName)
//        val tvCookTime = findViewById<TextView>(R.id.tvCookTime)
//        val tvDifficulty = findViewById<TextView>(R.id.tvDifficulty)
        val tvDescription = findViewById<TextView>(R.id.tvDescription)
        val tvIngredientsContent = findViewById<TextView>(R.id.tvIngredientsContent)
        val tvInstructionsContent = findViewById<TextView>(R.id.tvInstructionsContent)

        btnBack.setOnClickListener {
            finish()
        }

        tvRecipeName.text = recipe.name
//        tvCookTime.text = recipe.cookTime
//        tvDifficulty.text = recipe.difficulty
        tvDescription.text = recipe.description

        Glide.with(this)
            .load(recipe.imageUrl)
            .placeholder(R.drawable.ic_placeholder)
            .error(R.drawable.ic_placeholder)
            .centerCrop()
            .into(imgRecipeDetail)

        // Format ingredients
        val ingredientsText = recipe.ingredients.joinToString("\n") { "• $it" }
        tvIngredientsContent.text = ingredientsText

        // Format instructions
        val instructionsText = recipe.instructions.mapIndexed { index, instruction ->
            "${index + 1}. $instruction"
        }.joinToString("\n\n")
        tvInstructionsContent.text = instructionsText
    }
}