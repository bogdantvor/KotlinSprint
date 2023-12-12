package lesson11

data class Category(
    val categoryId: Int,
    val categoryName: String,
    val categoryTitle: String,
    val categoryImage: String
)

data class Ingredient(
    val ingredientId: Int,
    val ingredientName: String,
    val quantity: String,
    val portions: Int
)

data class Recipe(
    val recipeId: Int,
    val recipeName: String,
    val steps: List<String>
)


