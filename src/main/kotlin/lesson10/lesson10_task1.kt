package lesson10

fun main() {
    println("Добро пожаловать в игру в кости!")

    val playerResult = rollDice10_1("Игрок")
    val computerResult = rollDice10_1("Компьютер")

    when {
        playerResult > computerResult -> println("Победило человечество!")
        computerResult > playerResult -> println("Победила машина!")
        else -> println("Ничья!")
    }
}

fun rollDice10_1(player: String): Int {
    val diceResult = (1..6).random()
    println("$player бросает кость и выбрасывает: $diceResult")
    return diceResult
}
