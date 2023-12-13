package lesson11

class User11_1(
    val userId: String,
    val login: String,
    val password: String,
    val email: String
)

fun main() {
    val user1 = User11_1(userId = "1", login = "Alex", password = "Smirn123", email = "alexsmirn@example.com")
    val user2 = User11_1(userId = "2", login = "Ivan", password = "ivanqwerty", email = "ivanovivan@example.com")

    printUserInfo11_1(user1)
    printUserInfo11_1(user2)
}

fun printUserInfo11_1(user: User11_1): String {
    val userInfo =
        "Данные юзера: userId=${user.userId}, login=${user.login}, password=${user.password}, email=${user.email}"
    println(userInfo)
    return userInfo
}