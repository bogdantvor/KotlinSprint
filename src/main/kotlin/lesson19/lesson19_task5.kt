package lesson19

import java.util.*

enum class Gender {
    MALE,
    FEMALE,
    OTHER
}

data class Person(val name: String, val gender: Gender)

fun main() {
    val peopleList = mutableListOf<Person>()

    println("Добро пожаловать в приложение \"Картотека\"!")
    println("Пожалуйста, введите данные о 5 человеках")

    for (i in 1..5) {
        println("\nВведите данные для человека $i:")

        print("Имя: ")
        val name = readln()

        print("Пол (${Gender.entries.joinToString { it.name.lowercase(Locale.getDefault()) }}): ")
        val genderInput = readln().uppercase(Locale.getDefault())

        val gender = when (genderInput.uppercase(Locale.getDefault())) {
            "MALE" -> Gender.MALE
            "FEMALE" -> Gender.FEMALE
            "OTHER" -> Gender.OTHER
            else -> {
                println("Некорректное значение пола. Установлено значение OTHER")
                Gender.OTHER
            }
        }

        val person = Person(name, gender)
        peopleList.add(person)
    }

    println("\nСписок людей в картотеке:")
    peopleList.forEachIndexed { index, person ->
        println("${index + 1}. Имя: ${person.name}, Пол: ${person.gender.name.lowercase(Locale.getDefault())}")
    }
}
