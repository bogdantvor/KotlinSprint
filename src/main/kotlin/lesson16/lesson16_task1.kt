package lesson16

class Dice {
    private val number: Int = (1..6).random()

    fun showResult() {
        println("The result of the dice roll is: $number")
    }
}

fun main() {
    val dice = Dice()
    dice.showResult()
}
