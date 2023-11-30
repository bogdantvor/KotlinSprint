package lesson_7

fun main() {
    val passwordLength = 6
    val numberChar = ('0'..'9')
    val letterChar = ('a'..'z')

    val password = buildString {
        for (i in 1..passwordLength) {
            val char = if (i % 2 == 0) numberChar.random() else letterChar.random()
            append(char)
        }
    }

    println("Сгенерированный пароль: $password")
}