package lesson11

data class ForumUser(val userId: Int, val userName: String)

data class ForumMessage(val authorId: Int, val message: String)

class Forum {
    private var userCounter: Int = 0
    private val users = mutableListOf<ForumUser>()
    private val messages = mutableListOf<ForumMessage>()

    fun createNewUser(userName: String): ForumUser {
        val newUser = ForumUser(userCounter++, userName)
        users.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: Int, message: String): ForumMessage? {
        val isUserExists = users.any { it.userId == userId }
        if (isUserExists) {
            val newMessage = ForumMessage(userId, message)
            messages.add(newMessage)
            return newMessage
        } else {
            println("Пользователь не зарегистрирован на форуме. Писать сообщения запрещено")
            return null
        }
    }

    fun printThread() {
        messages.forEach { message ->
            users.find { it.userId == message.authorId }
                ?.let { author -> println("${author.userName}: ${message.message}") }
        }
    }
}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Alice")
    val user2 = forum.createNewUser("Bob")

    forum.createNewMessage(user1.userId, "Hello from Alice #1")
    forum.createNewMessage(user2.userId, "Hi there from Bob #1")
    forum.createNewMessage(user1.userId, "Alice's second message")
    forum.createNewMessage(user2.userId, "Bob's second message")

    forum.printThread()
}
