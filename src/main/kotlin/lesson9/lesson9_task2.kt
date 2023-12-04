package lesson9

fun main() {
    val baseIngredientsList = listOf("мясо", "картошка", "лук")
    println("В рецепте есть базовые ингредиенты: $baseIngredientsList")

    print("Желаете добавить еще ингредиенты? (да/нет): ")
    val answer = readln()

    if (answer == "да") {
        print("Какой ингредиент вы хотите добавить? ")
        val newIngredient = readln()

        val newIngredientsList = baseIngredientsList.toMutableList()
        newIngredientsList.add(newIngredient)

        println("Теперь в рецепте есть следующие ингредиенты: $newIngredientsList")
    } else {
        println("Программа завершена")
    }
}

