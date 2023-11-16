package lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    val arrivalTotalMinutes = departureHour * minutesInHour + departureMinute + travelTimeMinutes
    val arrivalHour = arrivalTotalMinutes / minutesInHour
    val arrivalMinute = arrivalTotalMinutes % minutesInHour

    println("Прибытие поезда в ${String.format("%02d", arrivalHour)}:${String.format("%02d", arrivalMinute)}")
}

    const val minutesInHour = 60