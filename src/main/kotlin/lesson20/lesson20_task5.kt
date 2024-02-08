package lesson20

import kotlin.random.Random

class Robot {
    private lateinit var speechModifier: (String) -> String

    fun setModifier(modifier: (String) -> String) {
        speechModifier = modifier
    }

    fun say(phrase: String) {
        println(phrase)
    }

    fun speakRandomPhrase() {
        val phrases = listOf(
            "Привет, я робот!",
            "Я умею программировать!",
            "Скоро я завершу свою миссию",
            "Работаю над улучшением своих навыков",
            "В будущем я стану ещё лучше!"
        )
        val randomIndex = Random.nextInt(phrases.size)
        val randomPhrase = phrases[randomIndex]

        say(randomPhrase)

        val modifiedPhrase = speechModifier(randomPhrase)
        say(modifiedPhrase)
    }
}

fun main() {
    val robot = Robot()

    robot.setModifier { phrase ->
        phrase.split(" ").reversed().joinToString(" ")
    }

    robot.speakRandomPhrase()
}
