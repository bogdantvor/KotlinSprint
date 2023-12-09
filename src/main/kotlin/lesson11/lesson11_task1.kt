package lesson11

class User(
    val userId: String,
    val login: String,
    val password: String,
    val email: String
)

fun main() {
    val user1 = User("1", "Alex", "Smirn123", "alexsmirn@example.com")
    val user2 = User("2", "Ivan", "ivanqwerty", "ivanovivan@example.com")

    printUserInfo(user1)
    printUserInfo(user2)
}

fun printUserInfo(user: User): String {
    val userInfo =
        "Данные юзера: userId=${user.userId}, login=${user.login}, password=${user.password}, email=${user.email}"
    println(userInfo)
    return userInfo
}