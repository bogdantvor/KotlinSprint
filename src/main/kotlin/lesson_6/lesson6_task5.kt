package lesson_6

fun main() {
    println("Добро пожаловать! Выберите регистрацию")
    print("Введите логин: ")
    val registeredLogin = readln()

    print("Введите пароль: ")
    val registeredPassword = readln()

    println("Регистрация завершена. Теперь вы можете войти")

    while (true) {
        print("Введите логин: ")
        val enteredLogin = readln()

        print("Введите пароль: ")
        val enteredPassword = readln()

        if (enteredLogin == registeredLogin && enteredPassword == registeredPassword) {
            println("Логин и пароль введены верно. Докажите, что Вы не бот")

            var attempts = 3
            val number1 = 1..9
            val number2 = 1..9

            while (attempts > 0) {
                val num1 = number1.random()
                val num2 = number2.random()
                println("Сложите два числа: $num1 + $num2")

                print("Введите ваш ответ: ")
                val answer = readln().toInt()

                if (answer == num1 + num2) {
                    println("Добро пожаловать!")
                    return
                } else {
                    println("Неверно. Осталось попыток: ${attempts - 1}")
                }

                attempts--
            }

            println("Доступ запрещен")
            break
        } else {
            println("Логин или пароль неверны. Попробуйте снова")
        }
    }
}