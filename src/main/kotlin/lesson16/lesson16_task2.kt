package lesson16

class Circle(private val radius: Double) {
    private val pi: Double = 3.14

    fun calculateCircumferenceLength(): Double {
        return 2 * pi * radius
    }

    fun calculateArea(): Double {
        return pi * radius * radius
    }
}

fun main() {
    val circle = Circle(radius = 4.5)

    val circumference = circle.calculateCircumferenceLength()
    val area = circle.calculateArea()

    println("Длина окружности: $circumference")
    println("Площадь круга: $area")
}
