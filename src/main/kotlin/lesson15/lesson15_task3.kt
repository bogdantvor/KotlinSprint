package lesson15

abstract class ForumUser(val username: String) {
    open fun readForum() {
        println("$username читает форум")
    }

    open fun postMessage(message: String) {
        println("$username написал сообщение: '$message'")
    }
}

class RegularUser(username: String) : ForumUser(username)

class Administrator(username: String) : ForumUser(username) {
    fun deleteMessage(message: String) {
        println("Администратор $username удалил сообщение: '$message'")
    }

    fun deleteUser(user: ForumUser) {
        println("Администратор $username удалил пользователя: ${user.username}")
    }
}

fun main() {
    val regularUser = RegularUser("Богдан")
    val administrator = Administrator("Владимир")

    regularUser.readForum()
    regularUser.postMessage("Привет всем!")

    administrator.readForum()
    administrator.postMessage("Важное сообщение!")
    administrator.deleteMessage("Спам")
    administrator.deleteUser(regularUser)
}
