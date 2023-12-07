package lesson_8

fun main() {
    val ingredients = mutableListOf("масло", "сахар", "мука", "яйцо", "соль", "ванильный сахар")

    println("Текущий список ингредиентов:")
    for (i in ingredients){
        println(i)
    }

    print("Введите ингредиент, который вы хотите заменить: ")
    val ingredientToReplace = readln()

    val indexOfIngredient = ingredients.indexOf(ingredientToReplace)

    if (ingredientToReplace.isNotEmpty() && indexOfIngredient != -1) {
        print("Введите новый ингредиент: ")
        val newIngredient = readln()

        ingredients[indexOfIngredient] = newIngredient

        println("Готово! Вы сохранили следующий список:")
        for (i in ingredients){
            println(i)
        }
    } else {
        println("Такого ингредиента в списке нет")
    }
}