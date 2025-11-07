package com.example.snapchef

import java.io.Serializable

data class Recipe(
    val name: String,
    val description: String,
    val imageUrl: String,
    val ingredients: List<String>,
    val instructions: List<String> = emptyList() // Default to empty list
) : Serializable