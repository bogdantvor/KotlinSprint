package lesson15

abstract class WeatherStationStats(val value: Double)

class Temperature(value: Double) : WeatherStationStats(value)

class PrecipitationAmount(value: Double) : WeatherStationStats(value)

class WeatherServer {
    fun sendWeatherData(data: WeatherStationStats) {
        when (data) {
            is Temperature -> {
                println("Отправка данных о температуре: ${data.value} градусов Цельсия")
            }
            is PrecipitationAmount -> {
                println("Отправка данных об осадках: ${data.value} мм")
            }
            else -> println("Неподдерживаемый тип данных")
        }
    }
}

fun main() {
    val temperatureData = Temperature(25.0)
    val precipitationData = PrecipitationAmount(10.5)

    val weatherServer = WeatherServer()

    weatherServer.sendWeatherData(temperatureData)
    weatherServer.sendWeatherData(precipitationData)
}
