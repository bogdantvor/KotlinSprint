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

class Truck(override var maxCargoWeight: Int) : Movable, CargoTransport, PassengerTransport {
    override var currentCargoWeight: Int = 0
    override var maxPassengers: Int = TRUCK_MAX_PASSENGERS
    override var currentPassengers: Int = 0

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
    val truck = Truck(TRUCK_MAX_CARGO_WEIGHT)
    val car = Car(CAR_MAX_PASSENGERS)

    val cargoWeight = CARGO_WEIGHT
    var remainingPassengers = PASSENGERS
    val tripsCargo = ceil(cargoWeight.toDouble() / truck.maxCargoWeight).toInt()
    repeat(tripsCargo) {
        truck.loadCargo(truck.maxCargoWeight)
        truck.loadPassengers(TRUCK_MAX_PASSENGERS)
        truck.move()
        truck.unloadCargo()
        truck.unloadPassengers()
        remainingPassengers = PASSENGERS - TRUCK_MAX_PASSENGERS
    }

    // Перевозка пассажиров
    if (remainingPassengers >= CAR_MAX_PASSENGERS) {
        car.loadPassengers(CAR_MAX_PASSENGERS)
        car.move()
        car.unloadPassengers()
        remainingPassengers -= CAR_MAX_PASSENGERS
    }


    if (remainingPassengers < CAR_MAX_PASSENGERS) {
        car.loadPassengers(remainingPassengers)
        car.move()
        car.unloadPassengers()
    }
}

const val TRUCK_MAX_CARGO_WEIGHT = 2
const val TRUCK_MAX_PASSENGERS = 1
const val CAR_MAX_PASSENGERS = 3
const val CARGO_WEIGHT = 2
const val PASSENGERS = 6
