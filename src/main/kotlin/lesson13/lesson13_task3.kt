package lesson13

class Contact13_3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
)

fun main() {
    val contactList = listOf(
        Contact13_3(name = "Иван", phoneNumber = 1234567890, company = "Google"),
        Contact13_3(name = "Алексей", phoneNumber = 9876543210, company = "Instagram"),
        Contact13_3(name = "Екатерина", phoneNumber = 5555555555),
        Contact13_3(name = "Мария", phoneNumber = 1111111111, company = "null"),
        Contact13_3(name = "Петр", phoneNumber = 9999999999)
    )

    val uniqueCompanies = contactList.mapNotNull { it.company }
    println("Список компаний в телефонной книге: $uniqueCompanies")
}