package lesson_4

fun main() {
    val cargo1Weight = 20
    val cargo1Volume = 80
    val cargo2Weight = 50
    val cargo2Volume = 100

    println("Груз с весом $cargo1Weight кг и объемом $cargo1Volume л соответствует категории 'Average': " +
            "${MIN_AVERAGE_WEIGHT < cargo1Weight && cargo1Weight < MAX_AVERAGE_WEIGHT && cargo1Volume < MAX_AVERAGE_VOLUME}")
    println("Груз с весом $cargo2Weight кг и объемом $cargo2Volume л соответствует категории 'Average': " +
            "${MIN_AVERAGE_WEIGHT < cargo2Weight && cargo2Weight < MAX_AVERAGE_WEIGHT && cargo2Volume < MAX_AVERAGE_VOLUME}")
}

    const val MIN_AVERAGE_WEIGHT = 35
    const val MAX_AVERAGE_WEIGHT = 100
    const val MAX_AVERAGE_VOLUME = 100