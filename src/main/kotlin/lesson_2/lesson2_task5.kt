package lesson_2

import kotlin.math.pow

fun main() {
    val deposit = 70000
    val yearPercentage = 16.7
    val years = 20

    val futureValue = deposit * (1 + yearPercentage / 100).pow(years)
    val formattedFutureValue = "%.3f".format(futureValue)
    println("Размер вклада через $years лет: $formattedFutureValue")
}