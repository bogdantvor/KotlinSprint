package lesson20

val greetUser: (String) -> String = { username ->
    "С наступающим Новым Годом, $username!"
}

fun main() {
    val username = "Богдан"
    val greetingMessage = greetUser(username)
    println(greetingMessage)
}
