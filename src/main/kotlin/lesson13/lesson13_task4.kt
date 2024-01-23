class Contact13_4(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContactInfo() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: $company")
    }
}

fun main() {
    val contactList = mutableListOf<Contact13_4>()

    var continueInput = true

    while (continueInput) {
        println("Введите данные нового контакта")

        print("Имя: ")
        val name = readln()

        print("Номер телефона: ")
        val phoneNumber = readln().toLongOrNull()

        if (phoneNumber == null) {
            println("Некорректный номер телефона для контакта '$name'. Запись не будет добавлена")
            continue
        }

        print("Компания: ")
        val company = readln()

        if (company.isEmpty()) {
            println("Пустое поле компании для контакта '$name'. Запись не будет добавлена")
            continue
        }

        val contact = Contact13_4(name = name, phoneNumber = phoneNumber, company = company)
        contactList.add(contact)

        print("Хотите ввести ещё один контакт? (да/нет): ")
        val input = readln()
        continueInput = input.trim().equals("да", ignoreCase = true)
    }

    println("Список контактов")
    for (contact in contactList) {
        contact.printContactInfo()
        println("--------------")
    }
}

