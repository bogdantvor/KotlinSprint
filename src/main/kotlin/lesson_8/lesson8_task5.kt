package lesson_8

/* fun main() {
    print("Введите количество ингредиентов: ")
    val ingredientCount = readln().toInt()

    val ingredients = Array(ingredientCount) {""}

    for (i in 0 until ingredientCount) {
        print("Введите ингредиент ${i + 1}: ")
        ingredients[i] = readln()
    }

    println("Вы ввели следующие ингредиенты:")
    for (ingredient in ingredients) {
        println(ingredient)
    }
} */

fun main() {
    print("Введите количество ингредиентов, а затем сами ингредиенты: ")
    val ingredients = Array(readln().toInt()) { readln() }

    println("Вы ввели следующие ингредиенты:")
    for (ingredient in ingredients) {
        println(ingredient)
    }
}

