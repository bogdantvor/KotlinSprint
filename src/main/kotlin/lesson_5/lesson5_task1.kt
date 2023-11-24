package lesson_5

fun main() {
    val number1 = (1..10).random()
    val number2 = (1..10).random()

    println("Для входа в приложение решите пример:")
    print("Сколько будет $number1 + $number2? Введите ответ: ")

    val userAnswer = readln().toInt()

    if (userAnswer == number1 + number2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен")
    }
}
