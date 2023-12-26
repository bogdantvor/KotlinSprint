package lesson16

class User(
    private val login: String = "user123",
    private val password: String = "securePassword") {
    fun validatePassword(inputPassword: String): Boolean {
        return inputPassword == password
    }
}

fun main() {
    val user = User()

    print("Введите пароль: ")
    val enteredPassword = readln()

    val isPasswordValid = user.validatePassword(enteredPassword)

    if (isPasswordValid) {
        println("Пароль верен. Доступ разрешен.")
    } else {
        println("Неверный пароль. Доступ запрещен.")
    }
}
