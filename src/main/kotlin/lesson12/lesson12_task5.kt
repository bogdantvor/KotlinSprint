package lesson12

import kotlin.random.Random

class WeatherDataKelvin12_5(
    kelvinDayTemperature: Int,
    kelvinNightTemperature: Int,
    isPrecipitation: Boolean
) {
    val dayTemperature: Int = kelvinDayTemperature - 273
    val nightTemperature: Int = kelvinNightTemperature - 273
    val isPrecipitation: Boolean = isPrecipitation
}

fun List<WeatherDataKelvin12_5>.calculateAverages(): Pair<Double, Double> {
    val dayTemperatures = map { it.dayTemperature.toDouble() }
    val nightTemperatures = map { it.nightTemperature.toDouble() }

    val averageDayTemperature = dayTemperatures.average()
    val averageNightTemperature = nightTemperatures.average()

    return averageDayTemperature to averageNightTemperature
}

fun List<WeatherDataKelvin12_5>.countPrecipitationDays(): Int {
    return count { it.isPrecipitation }
}

fun main() {
    val weatherDataList = mutableListOf<WeatherDataKelvin12_5>()

    repeat(30) {
        val kelvinDayTemperature = Random.nextInt(273, 300) // случайная температура в Кельвинах
        val kelvinNightTemperature = Random.nextInt(250, 273) // случайная температура в Кельвинах
        val isPrecipitation = Random.nextBoolean()

        val weatherData = WeatherDataKelvin12_5(kelvinDayTemperature, kelvinNightTemperature, isPrecipitation)
        weatherDataList.add(weatherData)
    }

    val dayTemperatures = weatherDataList.map { it.dayTemperature }
    val nightTemperatures = weatherDataList.map { it.nightTemperature }
    val precipitationDaysCount = weatherDataList.countPrecipitationDays()

    val (averageDayTemperature, averageNightTemperature) = weatherDataList.calculateAverages()

    println("Average Day Temperature: $averageDayTemperature°C")
    println("Average Night Temperature: $averageNightTemperature°C")
    println("Number of Days with Precipitation: $precipitationDaysCount")
}
