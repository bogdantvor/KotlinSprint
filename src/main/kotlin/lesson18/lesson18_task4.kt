package lesson18

open class Parcel {
    open fun calculateSurfaceArea(): Double {
        return 0.0
    }
}

class RectangularParcel(val length: Double, val width: Double, val height: Double) : Parcel() {
    override fun calculateSurfaceArea(): Double {
        return 2 * (length * width + length * height + width * height)
    }
}

class CubicParcel(val sideLength: Double) : Parcel() {
    override fun calculateSurfaceArea(): Double {
        return 6 * sideLength * sideLength
    }
}

fun main() {
    val rectangularParcel = RectangularParcel(3.0, 4.0, 5.0)
    val cubicParcel = CubicParcel(2.0)

    println("Площадь поверхности прямоугольной посылки: ${rectangularParcel.calculateSurfaceArea()}")
    println("Площадь поверхности кубической посылки: ${cubicParcel.calculateSurfaceArea()}")
}
