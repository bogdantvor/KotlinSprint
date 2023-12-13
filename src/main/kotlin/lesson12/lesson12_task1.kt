package lesson12

class WeatherData12_1 {
    var dayTemperature = 20
    var nightTemperature = 10
    var isPrecipitation = false

    fun displayWeatherInfo12_1() {
        println("Day Temperature: $dayTemperature°C")
        println("Night Temperature: $nightTemperature°C")
        println("Precipitation: $isPrecipitation")
    }
}

fun main() {
    val day1 = WeatherData12_1()
    day1.dayTemperature = 25
    day1.nightTemperature = 18
    day1.isPrecipitation = false

    val day2 = WeatherData12_1()
    day2.dayTemperature = 22
    day2.nightTemperature = 15
    day2.isPrecipitation = true

    println("Weather Data for Day 1:")
    day1.displayWeatherInfo12_1()

    println("\nWeather Data for Day 2:")
    day2.displayWeatherInfo12_1()
}
