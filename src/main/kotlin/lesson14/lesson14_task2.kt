package lesson14

open class Ship14_2(
    val name: String = "Liner Ship",
    val speed: Int = 20,
    val capacity: Int = 100,
    val cargoCapacity: Int = 100
) {
    open fun loadCargo() {
        println("$name выдвигает горизонтальный трап со шкафута")
    }

    open fun displayInfo() {
        println("Ship: $name, Speed: $speed, Capacity: $capacity, Cargo Capacity: $cargoCapacity")
    }
}

class CargoShip14_2(
    name: String = "Cargo Ship",
    speed: Int = 15,
    capacity: Int = 0,
    cargoCapacity: Int = 500
) : Ship14_2(name, speed, capacity, cargoCapacity) {
    override fun loadCargo() {
        println("$name активирует погрузочный кран")
    }
}

class Icebreaker14_2(
    name: String = "Icebreaker Ship",
    speed: Int = 10,
    capacity: Int = 50,
    val iceBreakingAbility: Boolean = true
) : Ship14_2(name, speed, capacity) {
    override fun loadCargo() {
        println("$name открывает ворота со стороны кормы")
    }
}

fun main() {
    val liner = Ship14_2()
    val cargoFreighter = CargoShip14_2()
    val icebreakerShip = Icebreaker14_2()

    liner.loadCargo()
    liner.displayInfo()

    cargoFreighter.loadCargo()
    cargoFreighter.displayInfo()

    icebreakerShip.loadCargo()
    icebreakerShip.displayInfo()
}
