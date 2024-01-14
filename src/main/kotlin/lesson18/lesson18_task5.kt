package lesson18

class Point(val x: Any, val y: Any)

class Square(val x: Any, val y: Any, val side: Any)

class Circle(val x: Any, val y: Any, val radius: Any)

class Screen {
    fun draw(point: Point) {
        println("Рисуем точку в (${point.x}, ${point.y})")
    }

    fun draw(square: Square) {
        println("Рисуем квадрат в (${square.x}, ${square.y}), сторона: ${square.side}")
    }

    fun draw(circle: Circle) {
        println("Рисуем круг в (${circle.x}, ${circle.y}), радиус: ${circle.radius}")
    }
}

fun main() {
    val screen = Screen()

    val intPoint = Point(1, 2)
    val floatSquare = Square(3.5f, 4.0f, 5.0f)
    val intCircle = Circle(6, 7, 8)

    screen.draw(intPoint)
    screen.draw(floatSquare)
    screen.draw(intCircle)
}
