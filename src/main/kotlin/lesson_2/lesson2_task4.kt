package lesson_2

fun main() {
    val crystalOreEarn = 7
    val ironOreEarn = 11
    val buffPercentage = 20

    val crystalOreBonusEarn = (crystalOreEarn * (buffPercentage / 100.0)).toInt()
    val ironOreBonusEarn = (ironOreEarn * (buffPercentage / 100.0)).toInt()

    println("Количество \"бонусной\" кристаллической руды: $crystalOreBonusEarn")
    println("Количество \"бонусной\" железной руды: $ironOreBonusEarn")
}