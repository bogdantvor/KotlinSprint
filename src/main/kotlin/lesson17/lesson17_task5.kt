package lesson17

class User(private var _login: String, private var _password: String) {
    val login: String
        get() = _login

    var newLogin: String = ""
        set(value) {
            println("Логин успешно изменен")
            _login = value
        }

    val password: String
        get() {
            return "*".repeat(_password.length)
        }

    var newPassword: String = ""
        set(value) {
            println("Вы не можете изменить пароль")
        }

}

fun main() {
    val user = User("exampleUser", "securePassword")

    println("Текущий логин: ${user.login}")
    user.newLogin = "newUserLogin"
    println("Новый логин: ${user.login}")

    println("Текущий пароль: ${user.password}")
    user.newPassword = "newSecurePassword"
}
