package lesson17

class Ship(val name: String, var averageSpeed: Double, var homePort: String) {
    var shipName: String = name
        set(value) {
            println("Предупреждение: Имя корабля изменить нельзя!")
        }
}

fun main() {
    val myShip = Ship("Мой корабль", 25.0, "Портовый город")

    println("Имя корабля: ${myShip.name}")
    println("Средняя скорость: ${myShip.averageSpeed} узлов")
    println("Порт приписки: ${myShip.homePort}")

    myShip.shipName = "Новое Имя"

    println("Имя корабля: ${myShip.name}")
    println("Средняя скорость: ${myShip.averageSpeed} узлов")
    println("Порт приписки: ${myShip.homePort}")
}
