package lesson_7

fun main() {
    val passwordLength = 6
    val password = buildString {
        for (i in 1..passwordLength) {
            val char = if (i % 2 == 0) ('0'..'9').random() else ('a'..'z').random()
            append(char)
        }
    }

    println("Сгенерированный пароль: $password")
}