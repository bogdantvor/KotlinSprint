package lesson_4

fun main() {
    val isSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val currentAirHumidity: Int = 20
    val currentSeason: String = "зима"

    val conditionsSuitable = isSunny && isAwningOpen && currentAirHumidity == AIR_HUMIDITY && currentSeason != "зима"
    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsSuitable")
}

    const val AIR_HUMIDITY = 20
