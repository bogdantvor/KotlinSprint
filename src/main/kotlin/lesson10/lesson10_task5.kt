package lesson10

import java.security.SecureRandom
import java.math.BigInteger

data class Product(val name: String, val price: Double)

val users = mapOf(
    "user1" to "password1",
    "user2" to "password2"
)

val products = listOf(
    Product("Product 1", 19.99),
    Product("Product 2", 29.99),
    Product("Product 3", 9.99),
    Product("Product 4", 39.99)
)

val userCart = mapOf(
    "user1" to listOf(products[0], products[1]),
    "user2" to listOf(products[2], products[3])
)

fun main() {
    print("Введите логин: ")
    val login = readln()

    print("Введите пароль: ")
    val password = readln()

    val token = authenticate(login, password)

    if (token != null) {
        println("Авторизация успешна. Токен доступа: $token")
        val userProducts = getUserCart(token)
        if (userProducts != null) {
            println("Содержимое корзины:")
            userProducts.forEach { println("${it.name} - ${it.price}") }
        } else {
            println("Не удалось получить корзину")
        }
    } else {
        println("Неудачная авторизация")
    }
}

fun authenticate(login: String, password: String): String? {
    val storedPassword = users[login]
    if (storedPassword == password) {
        return generateToken()
    }
    return null
}

fun getUserCart(token: String): List<Product>? {
    return userCart.entries.find { it.key == "user1" }?.value
}

fun generateToken(): String {
    val random = SecureRandom()
    return BigInteger(128, random).toString(32)
}
