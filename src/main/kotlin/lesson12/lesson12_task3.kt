package lesson12

class WeatherDataKelvin12_3(
    kelvinDayTemperature: Int,
    kelvinNightTemperature: Int,
    isPrecipitation: Boolean
) {
    private val dayTemperature: Int = kelvinDayTemperature - 273
    private val nightTemperature: Int = kelvinNightTemperature - 273
    private val isPrecipitation: Boolean = isPrecipitation

    fun displayWeatherInfo12_3() {
        println("Day Temperature: $dayTemperature°C")
        println("Night Temperature: $nightTemperature°C")
        println("Precipitation: $isPrecipitation")
    }
}

fun main() {
    val kelvinDayTemperature = 297
    val kelvinNightTemperature = 266
    val isPrecipitation = false

    val day1 = WeatherDataKelvin12_3(
        kelvinDayTemperature = kelvinDayTemperature,
        kelvinNightTemperature = kelvinNightTemperature,
        isPrecipitation = isPrecipitation
    )

    println("Weather Data for Day 1:")
    day1.displayWeatherInfo12_3()
}
