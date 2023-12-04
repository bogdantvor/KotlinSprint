package lesson9

fun main() {
    print("Введите 5 ингредиентов через запятую и пробел: ")
    val ingredientsString = readln()

    val ingredientsList = ingredientsString.split(", ")

    val ingredientsSortedList = ingredientsList.sorted()

    println("Отсортированные ингредиенты: $ingredientsSortedList")

}
