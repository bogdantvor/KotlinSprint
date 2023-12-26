package lesson16

class Player(val name: String, var health: Int, var attackPower: Int) {

    init {
        require(health > 0) { "Health should be greater than 0" }
        require(attackPower > 0) { "Attack power should be greater than 0" }
    }

    private fun checkDeath() {
        if (health <= 0) {
            health = 0
            attackPower = 0
            println("$name погиб!")
        }
    }

    fun receiveDamage(damage: Int) {
        require(damage >= 0) { "Damage should not be negative" }

        health -= damage
        println("$name получил урон: -$damage здоровья")

        checkDeath()
    }

    fun heal(amount: Int) {
        require(amount >= 0) { "Healing amount should not be negative" }

        if (health > 0) {
            health += amount
            println("$name восстановил здоровье: +$amount здоровья")
        }

        checkDeath()
    }
}

fun main() {
    val player = Player(name = "Player1", health = 100, attackPower = 20)
    println("Данные игрока: здоровье - ${player.health}, атака - ${player.attackPower}")

    player.receiveDamage(30)
    println("Текущее здоровье: ${player.health}")
    player.heal(15)
    println("Текущее здоровье: ${player.health}")
    player.receiveDamage(55)
    println("Текущее здоровье: ${player.health}")
    player.heal(50)
    println("Текущее здоровье: ${player.health}")
    player.receiveDamage(90)
}
