package lesson10

fun main() {
    println("Добро пожаловать в улучшенную игру в кости!")

    var playerWins = 0

    do {
        val playerResult = rollDice10_4("Игрок")
        val computerResult = rollDice10_4("Компьютер")

        when {
            playerResult > computerResult -> {
                playerWins++
                println("Победа в этом раунде за человечеством!")
            }
            computerResult > playerResult -> println("Победа в этом раунде за машиной!")
            else -> println("Ничья в этом раунде!")
        }

    } while (playAgain())

    println("Игра завершена. Вы выиграли $playerWins партий")
}

fun rollDice10_4(player: String): Int {
    val diceResult = (1..6).random()
    println("$player бросает кость и выбрасывает: $diceResult")
    return diceResult
}

fun playAgain(): Boolean {
    print("Хотите бросить кости еще раз? Введите 'Да' или 'Нет': ")
    val answer = readln()
    return answer.equals("да", ignoreCase = true)
}
