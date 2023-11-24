package lesson_5

fun main() {
    print("Введите первое число от 0 до 42: ")
    val userNumber1 = readln().toIntOrNull()

    print("Введите второе число от 0 до 42: ")
    val userNumber2 = readln().toIntOrNull()


    if ((userNumber1 == WIN_NUMBER_1 && userNumber2 == WIN_NUMBER_2) ||
        (userNumber1 == WIN_NUMBER_2 && userNumber2 == WIN_NUMBER_1)
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((userNumber1 == WIN_NUMBER_1 || userNumber2 == WIN_NUMBER_2) ||
        (userNumber2 == WIN_NUMBER_1 || userNumber1 == WIN_NUMBER_2)
    ) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Выигрышные числа были $WIN_NUMBER_1 и $WIN_NUMBER_2")
}

    const val WIN_NUMBER_1 = 7
    const val WIN_NUMBER_2 = 21