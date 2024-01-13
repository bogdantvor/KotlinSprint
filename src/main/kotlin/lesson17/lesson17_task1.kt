package lesson17

class QuizElement(private var _question: String, private var _answer: String) {
    val question: String
        get() = _question

    var customAnswer: String
        get() = _answer
        set(value) {
            _answer = value
        }
}

fun main() {
    val quizElement = QuizElement("Как называется единица измерения времени, равная 60 секундам?", "Минута")

    println("Вопрос: ${quizElement.question}")
    println("Ответ: ${quizElement.customAnswer}")

    quizElement.customAnswer = "Час"

    println("Измененный ответ: ${quizElement.customAnswer}")
}
