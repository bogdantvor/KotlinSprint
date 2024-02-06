package lesson20

class Player(var hasKey: Boolean)

val checkDoor: (Player) -> Unit = { player ->
    if (player.hasKey) {
        println("Дверь открыта")
    } else {
        println("Дверь заперта")
    }
}

fun main() {
    val playerWithKey = Player(true)
    val playerWithoutKey = Player(false)

    print("Игрок с ключом: ")
    checkDoor(playerWithKey)

    print("Игрок без ключа: ")
    checkDoor(playerWithoutKey)
}
