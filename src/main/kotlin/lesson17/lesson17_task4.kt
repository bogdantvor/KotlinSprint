package lesson17

class Parcel(val trackingNumber: Int, private var _location: String) {
    var moveCounter: Int = 0
        private set

    var location: String
        get() = _location
        set(value) {
            _location = value
            moveCounter++
        }
}

fun main() {
    val parcel = Parcel(123456, "Пункт А")

    println("Начальное местоположение: ${parcel.location}")
    println("Счетчик перемещений: ${parcel.moveCounter}")

    parcel.location = "Пункт Б"
    println("Новое местоположение: ${parcel.location}")
    println("Счетчик перемещений: ${parcel.moveCounter}")

    parcel.location = "Пункт В"
    println("Новое местоположение: ${parcel.location}")
    println("Счетчик перемещений: ${parcel.moveCounter}")
}
