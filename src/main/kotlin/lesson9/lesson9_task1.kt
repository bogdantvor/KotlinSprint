package lesson9

fun main() {
    val ingredients = listOf("мясо", "картошка", "лук", "морковь", "соль", "перец")

    println("В рецепте есть следующие ингредиенты: $ingredients")

    println("Ингредиенты:")
    ingredients.forEach { ingredient -> println(ingredient) }
}
