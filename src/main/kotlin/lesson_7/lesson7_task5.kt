package lesson_7

fun main() {
    print("Введите максимальную длину пароля: ")
    val maxLength = readln().toInt()
    val numbersRange = 0..9
    val lettersRange = 'a'..'z'
    val capitalLettersRange = 'A'..'Z'
    val characters = (numbersRange + lettersRange + capitalLettersRange).toList()

    if (maxLength >= 6) {
        val password = buildString {
            for (i in 1..maxLength) {
                val char = characters.random()
                append(char)
            }
        }

        println("Сгенерированный пароль: $password")
    } else {
        println("Минимальная длина пароля - 6 символов. Введите корректное значение")
    }
}
