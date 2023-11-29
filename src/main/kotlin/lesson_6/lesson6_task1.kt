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
            println("Авторизация прошла успешно")
            break
        } else {
            println("Логин или пароль неверны. Попробуйте снова")
        }
    }
}
