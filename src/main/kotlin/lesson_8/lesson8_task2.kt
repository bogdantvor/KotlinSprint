package lesson_8

fun main() {
    val recipeIngredients = arrayOf("мясо", "лук", "морковь", "картошка", "соль", "перец")

    print("Введите ингредиент, который Вы хотите найти: ")
    val userInput = readln()

    var elementFound = false

    for (element in recipeIngredients) {
        if (element == userInput) {
            elementFound = true
            break
        }
    }

    if (elementFound) {
        println("Ингредиент $userInput в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }

}
