package lesson_4

fun main() {
    val sunnyWeather: Boolean = true
    val tentOpen: Boolean = true
    val airHumidity: Int = 20
    val currentSeason: String = "зима"

    val conditionsSuitable = sunnyWeather && tentOpen && airHumidity == 20 && currentSeason != "зима"
    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsSuitable")
}
