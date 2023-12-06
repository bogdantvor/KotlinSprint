package lesson10

fun main() {
    println("Добро пожаловать в приложение!")

    print("Введите логин: ")
    val login = readln().trim()

    print("Введите пароль: ")
    val password = readln().trim()

    if (validateInput(login) && validateInput(password)) {
        println("Регистрация успешна! Добро пожаловать, $login!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun validateInput(input: String): Boolean {
    return input.length >= 4
}
