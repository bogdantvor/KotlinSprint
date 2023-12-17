package lesson13

class Contact13_5(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContactInfo13_5() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    print("Введите телефонный номер контакта:")
    try {
        val phoneNumber = readln().toLong()
    } catch (e: NumberFormatException) {
        println("Произошла ошибка - ${e.message}")
    }
}
