package lesson15

import kotlin.math.ceil

interface Movable {
    fun move()
}

interface PassengerTransport {
    var maxPassengers: Int
    var currentPassengers: Int

    fun loadPassengers(passengerCount: Int)
    fun unloadPassengers()
}

interface CargoTransport {
    var maxCargoWeight: Int
    var currentCargoWeight: Int

    fun loadCargo(cargoWeight: Int)
    fun unloadCargo()
}

class Truck(override var maxCargoWeight: Int) : Movable, CargoTransport {
    override var currentCargoWeight: Int = 0

    override fun move() {
        println("Грузовик едет")
    }

    override fun loadCargo(cargoWeight: Int) {
        if (currentCargoWeight + cargoWeight <= maxCargoWeight) {
            currentCargoWeight += cargoWeight
            println("Загружено $cargoWeight тонн груза. Текущий вес: $currentCargoWeight тонн")
        } else {
            println("Перегруз! Нельзя загрузить $cargoWeight тонн груза")
        }
    }

    override fun unloadCargo() {
        println("Выгружено $currentCargoWeight тонн груза")
        currentCargoWeight = 0
    }
}

class Car(override var maxPassengers: Int) : Movable, PassengerTransport {
    override var currentPassengers: Int = 0

    override fun move() {
        println("Автомобиль едет")
    }

    override fun loadPassengers(passengerCount: Int) {
        if (currentPassengers + passengerCount <= maxPassengers) {
            currentPassengers += passengerCount
            println("Посажено $passengerCount пассажиров. Текущее количество пассажиров: $currentPassengers")
        } else {
            println("Превышение максимальной пассажировместимости! Нельзя посадить $passengerCount пассажиров")
        }
    }

    override fun unloadPassengers() {
        println("Вышло $currentPassengers пассажиров")
        currentPassengers = 0
    }
}

fun main() {
    val truck = Truck(MAX_CARGO_WEIGHT)
    val car = Car(MAX_PASSENGERS)

    val cargoWeight = CARGO_WEIGHT
    val tripsCargo = ceil(cargoWeight.toDouble() / truck.maxCargoWeight).toInt()
    repeat(tripsCargo) {
        truck.loadCargo(truck.maxCargoWeight)
        truck.move()
        truck.unloadCargo()
    }

    val passengerCount = PASSENGERS
    val tripsPassengers = ceil(passengerCount.toDouble() / car.maxPassengers).toInt()
    repeat(tripsPassengers) {
        car.loadPassengers(car.maxPassengers)
        car.move()
        car.unloadPassengers()
    }
}

const val MAX_CARGO_WEIGHT = 2
const val MAX_PASSENGERS = 3
const val CARGO_WEIGHT = 2
const val PASSENGERS = 6
