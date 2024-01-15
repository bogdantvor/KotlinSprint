package lesson18

import kotlin.random.Random

open class Dice(val sides: Int) {
    open fun rollDice18_2() {
        val result = Random.nextInt(1, sides + 1)
        println("Бросок $sides-гранной кости: $result")
    }
}

class FourSidedDice : Dice(4)

class SixSidedDice : Dice(6)

class EightSidedDice : Dice(8)

fun main() {
    val fourSidedDice = FourSidedDice()
    val sixSidedDice = SixSidedDice()
    val eightSidedDice = EightSidedDice()

    val diceList: List<Dice> = listOf(fourSidedDice, sixSidedDice, eightSidedDice)

    for (dice in diceList) {
        dice.rollDice18_2()
    }
}
