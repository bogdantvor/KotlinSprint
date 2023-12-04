package lesson9

fun main() {
    val onePortionIngredients = listOf(2, 50, 15) // [яйца, молоко, масло]

    print("Введите количество порций: ")
    val portionCount = readln().toInt()

    val allPortionsIngredients = onePortionIngredients.map { it * portionCount }

    println("На $portionCount порций вам понадобится: " + "Яиц – ${allPortionsIngredients[0]}, " +
            "молока – ${allPortionsIngredients[1]}, сливочного масла – ${allPortionsIngredients[2]}")
}
