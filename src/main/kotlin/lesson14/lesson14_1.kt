package lesson14

open class Ship(
    val name: String = "Default Ship",
    val speed: Int = 20,
    val capacity: Int = 100,
    val cargoCapacity: Int = 100
)

class CargoShip(
    name: String = "Cargo Ship",
    speed: Int = 15,
    capacity: Int = 0,
    cargoCapacity: Int = 500
) : Ship(name, speed, capacity, cargoCapacity)

class Icebreaker(
    name: String = "Icebreaker",
    speed: Int = 10,
    capacity: Int = 50,
    cargoCapacity: Int,
    val iceBreakingAbility: Boolean = true
) : Ship(name, speed, capacity, cargoCapacity)

fun main() {
    val liner = Ship()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()
}
