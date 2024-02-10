package lesson21

class Player21_3(val name: String, var currentHealth: Int, val maxHealth: Int)

val healPotion: (Player21_3) -> Unit = { player ->
    player.currentHealth = player.maxHealth
}

fun Player21_3.isHealthy(): Boolean {
    return currentHealth == maxHealth
}

fun main() {
    val player = Player21_3("bogdanTV", 50, 100)

    println("Перед использованием зелья: Здоровье игрока ${player.name}: ${player.currentHealth}/${player.maxHealth}")
    println("Здоровье игрока ${player.name} является максимальным: ${player.isHealthy()}")

    healPotion(player)

    println("После использования зелья: Здоровье игрока ${player.name}: ${player.currentHealth}/${player.maxHealth}")
    println("Здоровье игрока ${player.name} является максимальным: ${player.isHealthy()}")
}
