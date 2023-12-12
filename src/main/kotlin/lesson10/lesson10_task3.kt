package lesson10

fun main() {
    println("Добро пожаловать в генератор паролей!")

    print("Введите длину пароля (целое положительное число): ")
    val passwordLength = readln().toInt()

    val password = generatePassword(passwordLength)
    println("Сгенерированный пароль: $password")
}

fun generatePassword(length: Int): String {
    val digits = 0..9
    val specialChars = ' '..'/'

    var password = ""
    for (i in 1..length) {
        val charSet = if (i % 2 == 0) specialChars else digits
        val randomChar = charSet.toString().random()
        password += randomChar
    }

    return password
}
