package lesson9

import java.util.*

fun main() {
    val ingredientsList = mutableListOf<String>()

    var ingredientNumber = 1
    while (ingredientNumber <= 5) {
        print("Введите название ингредиента $ingredientNumber: ")
        val ingredient = readln()

        if (ingredient.isNotEmpty() && !ingredientsList.contains(ingredient)) {
            ingredientsList.add(ingredient)
            ingredientNumber++
        } else {
            println("Некорректный ввод. Пожалуйста, введите уникальный ингредиент")
        }
    }

    ingredientsList.sort()

    print(ingredientsList.first()
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })

    for (i in 1 until ingredientsList.size) {
        print(", ${ingredientsList[i]}")
    }
}
