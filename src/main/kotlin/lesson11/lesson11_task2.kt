package lesson11

class User11_2(
    private val userId: String,
    private val login: String,
    private var password: String,
    private val email: String,
    private var bio: String = ""
) {
    fun displayUserInfo11_2() {
        println("userId = $userId, login = $login, password = $password, email = $email, bio = $bio")
    }

    fun updateBio11_2() {
        print("Введите информацию о себе: ")
        bio = readln()
        println("Информация о себе успешно обновлена")
    }

    fun changePassword11_2() {
        print("Введите текущий пароль: ")
        val currentPassword = readln()

        if (currentPassword == password) {
            print("Введите новый пароль: ")
            password = readln()
            println("Пароль успешно изменен")
        } else {
            println("Неверный текущий пароль. Изменение пароля отменено")
        }
    }
}

fun main() {
    val user = User11_2(userId = "2", login = "Ivan", password = "ivanqwerty", email = "ivanovivan@example.com")

    user.displayUserInfo11_2()
    user.updateBio11_2()
    user.changePassword11_2()

    println("Обновленная информация о пользователе:")
    user.displayUserInfo11_2()
}
