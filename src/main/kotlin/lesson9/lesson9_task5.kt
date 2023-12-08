package lesson9

import java.util.*

fun main() {
    val mutableSet = mutableSetOf<String>()

    var ingredientNumber = 1
    while (ingredientNumber <= 5) {
        print("Введите название ингредиента $ingredientNumber: ")
        val ingredient = readln()

        if (ingredient.isNotEmpty()) {
            mutableSet.add(ingredient)
            ingredientNumber++
        } else {
            println("Некорректный ввод. Пожалуйста, введите уникальный ингредиент")
        }
    }

    val ingredientList = mutableSet.toList().sorted()

    val ingredientsString = ingredientList.joinToString(separator = ", ")

    print(ingredientsString.replaceFirstChar { if (it.isLowerCase())
        it.titlecase(Locale.getDefault()) else it.toString() })
}
