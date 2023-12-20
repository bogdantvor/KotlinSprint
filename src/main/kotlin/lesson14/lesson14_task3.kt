package lesson14

import kotlin.math.PI

abstract class Figure(val color: String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun calculateArea(): Double = PI * radius * radius

    override fun calculatePerimeter(): Double = 2 * PI * radius
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun calculateArea(): Double = width * height

    override fun calculatePerimeter(): Double = 2 * (width + height)
}

fun main() {
    val blackCircle = Circle(color = "Black", radius = 5.0)
    val whiteCircle = Circle(color = "White", radius = 7.0)

    val blackRectangle = Rectangle(color = "Black", width = 4.0, height = 6.0)
    val whiteRectangle = Rectangle(color = "White", width = 8.0, height = 3.0)

    val figures = listOf(blackCircle, whiteCircle, blackRectangle, whiteRectangle)

    val sumOfBlackPerimeters = figures
        .filter { it.color.equals("Black", ignoreCase = true) }
        .sumOf { it.calculatePerimeter() }

    val sumOfWhiteAreas = figures
        .filter { it.color.equals("White", ignoreCase = true) }
        .sumOf { it.calculateArea() }

    println("Сумма периметров всех черных фигур: $sumOfBlackPerimeters")
    println("Сумма площадей всех белых фигур: $sumOfWhiteAreas")
}
