package lesson_2

fun main() {
    val crystalOreEarn = 7
    val ironOreEarn = 11
    val buffPercentage = 0.2

    val crystalOreBonusEarn = (crystalOreEarn * (1 + buffPercentage) - crystalOreEarn).toInt()
    val ironOreBonusEarn = (ironOreEarn * (1 + buffPercentage) - ironOreEarn).toInt()

    println("Количество \"бонусной\" кристаллической руды: $crystalOreBonusEarn")
    println("Количество \"бонусной\" железной руды: $ironOreBonusEarn")
}