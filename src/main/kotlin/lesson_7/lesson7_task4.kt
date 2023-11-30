package lesson_7

fun main() {
    print("Введите количество секунд для таймера: ")
    val seconds = readln().toInt()

    println("Таймер запущен на $seconds секунд")

    for (remainingSeconds in seconds downTo 0) {
        println("Осталось времени: $remainingSeconds секунд")
        Thread.sleep(1000)
    }

    println("Время вышло")
}
