package lesson20

class Player20_2(val name: String, var currentHealth: Int, val maxHealth: Int)

val healPotion: (Player20_2) -> Unit = { player ->
    player.currentHealth = player.maxHealth
}

fun main() {
    val player = Player20_2("bogdanTV", 50, 100)

    println("Перед использованием зелья: Здоровье игрока ${player.name}: ${player.currentHealth}/${player.maxHealth}")

    healPotion(player)

    println("После использования зелья: Здоровье игрока ${player.name}: ${player.currentHealth}/${player.maxHealth}")
}
