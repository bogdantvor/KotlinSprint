package lesson12

class WeatherData12_2(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isPrecipitation: Boolean
) {
    fun displayWeatherInfo12_2() {
        println("Day Temperature: $dayTemperature°C")
        println("Night Temperature: $nightTemperature°C")
        println("Precipitation: $isPrecipitation")
    }
}

fun main() {
    val day1 = WeatherData12_2(dayTemperature = 24, nightTemperature = 19, isPrecipitation = false)

    println("Weather Data for Day 1:")
    day1.displayWeatherInfo12_2()
}
