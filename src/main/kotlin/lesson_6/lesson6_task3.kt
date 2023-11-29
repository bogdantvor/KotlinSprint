package lesson_6

fun main() {
    print("Введите количество секунд для таймера: ")
    val seconds = readln().toInt()
    println("Таймер запущен на $seconds секунд")

    var remainingSeconds = seconds
    while (remainingSeconds > 0) {
        println("Осталось секунд: $remainingSeconds")
        Thread.sleep(1000)
        remainingSeconds--
    }

    println("Время вышло")
}