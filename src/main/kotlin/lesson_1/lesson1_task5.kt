package lesson_1

fun main() {

    val totalSeconds = 6488

    val hours = totalSeconds / SEC_IN_HOUR
    val minutes = (totalSeconds % SEC_IN_HOUR) / SEC_IN_MINUTE
    val seconds = totalSeconds % SEC_IN_MINUTE

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println("Время проведенное в космосе: $formattedTime")
}

    const val SEC_IN_HOUR = 3600
    const val SEC_IN_MINUTE = 60