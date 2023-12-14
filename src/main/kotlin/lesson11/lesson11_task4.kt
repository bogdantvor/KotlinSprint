package lesson11

data class Category(
    val categoryId: Int,
    val categoryName: String,
    val categoryTitle: String,
    val categoryImage: String,
    val recipes: List<Recipe>
)

data class Recipe(
    val recipeId: Int,
    val recipeName: String,
    val recipeImage: String,
    val ingredients: List<Ingredient>,
    val steps: List<String>
)

data class Ingredient(
    val ingredientId: Int,
    val ingredientName: String,
    val quantity: String,
    val portions: Int
)

