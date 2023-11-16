package lesson_1

fun main() {

    val totalSeconds = 6488

    val hours = totalSeconds / secInHour
    val minutes = (totalSeconds % secInHour) / secInMinute
    val seconds = totalSeconds % secInMinute

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println("Время проведенное в космосе: $formattedTime")
}

    const val secInHour = 3600
    const val secInMinute = 60