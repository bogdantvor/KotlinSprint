package lesson9

fun main() {
    print("Введите 5 ингредиентов через запятую и пробел: ")
    val ingredientsList = readln().split(", ").toList()

    val ingredientsNewList = ingredientsList.sorted()

    println("Отсортированные ингредиенты: $ingredientsNewList")
}
