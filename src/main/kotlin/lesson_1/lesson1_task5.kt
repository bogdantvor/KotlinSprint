package lesson_1

fun main() {

    val totalSeconds = 6488

    val hours = totalSeconds / 3600
    val minutes = (totalSeconds % 3600) / 60
    val seconds = totalSeconds % 60

    println("Гагарин пробыл в космосе - ${formatTime(hours)}:${formatTime(minutes)}:${formatTime(seconds)}")
}

fun formatTime(value: Int): String {
    return if (value < 10) "0$value" else value.toString()
}
