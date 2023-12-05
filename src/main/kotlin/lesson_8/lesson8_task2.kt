package lesson_8

fun main() {
    val recipeIngredients = arrayOf("мясо", "лук", "морковь", "картошка", "соль", "перец")

    print("Введите ингредиент, который Вы хотите найти: ")
    val userInput = readln()

    for (element in recipeIngredients) {
        if (element == userInput) {
            println("Ингредиент $userInput в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}
