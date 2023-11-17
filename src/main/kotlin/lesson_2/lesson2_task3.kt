package lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    val arrivalTotalMinutes = departureHour * MINUTES_IN_HOUR + departureMinute + travelTimeMinutes
    val arrivalHour = arrivalTotalMinutes / MINUTES_IN_HOUR
    val arrivalMinute = arrivalTotalMinutes % MINUTES_IN_HOUR

    println("Прибытие поезда в ${String.format("%02d", arrivalHour)}:${String.format("%02d", arrivalMinute)}")
}

    const val MINUTES_IN_HOUR = 60