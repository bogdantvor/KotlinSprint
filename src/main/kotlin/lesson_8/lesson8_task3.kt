package lesson_8

fun main() {
    val recipeIngredients = arrayOf("мясо", "лук", "морковь", "картошка", "соль", "перец")

    print("Введите ингредиент, который Вы хотите найти: ")
    val userInput = readln()

    val isContain = recipeIngredients.contains(userInput)

    if (isContain) {
        println("Ингредиент $userInput в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
