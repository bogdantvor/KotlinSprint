package lesson_5

fun main() {
    val winNumbers = List(3) { (0..42).random() }

    val userNumbers = mutableListOf<Int>()

    repeat(3) {
        print("Введите число от 0 до 42: ")
        val userInput = readln().toIntOrNull()

        if (userInput != null) {
            userNumbers.add(userInput)
        } else {
            println("Некорректный ввод. Пожалуйста, введите число")
        }
    }

    val matchingNumbers = winNumbers.intersect(userNumbers)

    when (matchingNumbers.size) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз")
        1 -> println("Вы угадали одно число и получаете утешительный приз")
        else -> println("К сожалению, Вы не угадали ни одного числа")
    }

    println("Выигрышные числа были: ${winNumbers[0]}, ${winNumbers[1]}, ${winNumbers[2]}")
}
