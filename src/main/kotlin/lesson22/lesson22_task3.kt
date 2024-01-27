package lesson22

data class Person(val name: String, val age: Int, val city: String)

fun main() {
    val person = Person(name = "Ivanov Ivan", age = 30, city = "Paris")

    val (personName, personAge, personCity) = person

    println("Имя: $personName")
    println("Возраст: $personAge")
    println("Город: $personCity")
}
