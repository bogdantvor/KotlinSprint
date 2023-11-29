package lesson_6

fun main() {
    val secretNumber = (1..9).random()
    var attempts = 5

    println("Попробуйте угадать число от 1 до 9")

    while (attempts > 0) {
        print("Введите ваш вариант: ")
        val guess = readln().toInt()

        if (guess == secretNumber) {
            println("Это была великолепная игра! Вы угадали число $secretNumber")
            return
        } else {
            println("Неверно. Осталось попыток: ${attempts - 1}")
        }

        attempts--
    }

    println("Было загадано число $secretNumber. К сожалению, вы использовали все попытки")
}
