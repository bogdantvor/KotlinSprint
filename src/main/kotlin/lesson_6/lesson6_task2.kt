package lesson_6

fun main() {
    print("Введите количество секунд для таймера: ")
    val seconds = readln().toInt()

    println("Таймер запущен на $seconds секунд")
    Thread.sleep(seconds * 1000L)

    println("Прошло $seconds секунд")
}
