package lesson_5

import java.time.LocalDate
fun main() {
    print("Введите Ваш год рождения: ")
    val birthYear = readln().toInt()
    val userAge = LocalDate.now().year - birthYear

    if (userAge >= AGE_OF_MAJORITY){
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран")
    }

}

    const val AGE_OF_MAJORITY = 18