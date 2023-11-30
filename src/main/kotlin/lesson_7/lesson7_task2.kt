package lesson_7

fun main() {
    var authorizationCode = generateAuthorizationCode()
    println("Ваш код авторизации: $authorizationCode")

    for (attempt in 1..3) {
        print("Введите код авторизации: ")
        val userInput = readln().toInt()

        if (userInput == authorizationCode) {
            println("Добро пожаловать! Авторизация успешна")
            return
        } else {
            println("Неверный код авторизации. Генерируем новый код")
            authorizationCode = generateAuthorizationCode()
            println("Новый код авторизации: $authorizationCode")
        }
    }

    println("Превышено количество попыток. Авторизация не удалась")
}

fun generateAuthorizationCode(): Int {
    return (1000..9999).random()
}