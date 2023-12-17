package lesson12
class WeatherDataKelvin12_4(
    kelvinDayTemperature: Int,
    kelvinNightTemperature: Int,
    isPrecipitation: Boolean
) {
    private val dayTemperature: Int = kelvinDayTemperature - 273
    private val nightTemperature: Int = kelvinNightTemperature - 273
    private val isPrecipitation: Boolean = isPrecipitation

    init {
        displayWeatherInfo12_4()
    }

    fun displayWeatherInfo12_4() {
        println("Day Temperature: $dayTemperature°C")
        println("Night Temperature: $nightTemperature°C")
        println("Precipitation: $isPrecipitation")
    }
}

fun main() {
    val kelvinDayTemperature = 297
    val kelvinNightTemperature = 266
    val isPrecipitation = false

    val day1 = WeatherDataKelvin12_4(
        kelvinDayTemperature = kelvinDayTemperature,
        kelvinNightTemperature = kelvinNightTemperature,
        isPrecipitation = isPrecipitation
    )
}
