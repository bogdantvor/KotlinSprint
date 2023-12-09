package lesson11

class User2(
    private val userId: String,
    private val login: String,
    private var password: String,
    private val email: String,
    private var bio: String = ""
) {
    fun displayUserInfo() {
        println("userId = $userId, login = $login, password = $password, email = $email, bio = $bio")
    }

    fun updateBio() {
        print("Введите информацию о себе: ")
        bio = readln()
        println("Информация о себе успешно обновлена")
    }

    fun changePassword() {
        print("Введите текущий пароль: ")
        val currentPassword = readln()

        if (currentPassword == password) {
            print("Введите новый пароль: ")
            val newPassword = readln()
            password = newPassword
            println("Пароль успешно изменен")
        } else {
            println("Неверный текущий пароль. Изменение пароля отменено")
        }
    }
}

fun main() {
    val user = User2("1", "Alex", "Smirn123", "alexsmirn@example.com")

    user.displayUserInfo()
    user.updateBio()
    user.changePassword()

    println("Обновленная информация о пользователе:")
    user.displayUserInfo()
}
