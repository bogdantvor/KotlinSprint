package lesson9

fun main() {
    val ingredientsList = mutableListOf("мясо", "картошка", "лук")
    println("В рецепте есть базовые ингредиенты: $ingredientsList")

    print("Желаете добавить еще ингредиенты? (да/нет): ")
    val answer = readln()

    if (answer.equals("да", ignoreCase = true)) {
        print("Какой ингредиент вы хотите добавить? ")
        val newIngredient = readln()

        ingredientsList.add(newIngredient)

        println("Теперь в рецепте есть следующие ингредиенты: $ingredientsList")
    } else {
        println("Программа завершена")
    }
}

