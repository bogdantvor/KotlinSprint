package lesson19

class Spaceship {
    fun launch() {
        // TODO: Дополнительная логика для взлета
    }

    fun land() {
        // TODO: Дополнительная логика для посадки
    }

    fun shootAsteroid() {
        // TODO: Дополнительная логика для стрельбы по астероиду
    }

    fun additionalLogicReminder() {
        println("Напоминание: здесь нужна информация о дополнительной логике")
    }

    fun notImplementedMethod() {
        TODO()
    }
}

fun main() {
    val spaceship = Spaceship()

    spaceship.launch()
    spaceship.land()
    spaceship.shootAsteroid()
    spaceship.additionalLogicReminder()
    spaceship.notImplementedMethod()
}
