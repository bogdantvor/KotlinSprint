package lesson13

class Contact13_2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContactInfo13_2() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contact = Contact13_2(name = "Иван", phoneNumber = 1234567890)
    contact.printContactInfo13_2()
}
