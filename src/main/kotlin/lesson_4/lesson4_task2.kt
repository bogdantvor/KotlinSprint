package lesson_4

fun main() {
    val minAverageWeight = 35
    val maxAverageWeight = 100
    val maxAverageVolume = 100

    val cargo1Weight = 20
    val cargo1Volume = 80
    val cargo2Weight = 50
    val cargo2Volume = 100

    println("Груз с весом $cargo1Weight кг и объемом $cargo1Volume л соответствует категории 'Average': ${minAverageWeight < cargo1Weight && cargo1Weight < maxAverageWeight && cargo1Volume < maxAverageVolume}")
    println("Груз с весом $cargo2Weight кг и объемом $cargo2Volume л соответствует категории 'Average': ${minAverageWeight < cargo2Weight && cargo2Weight < maxAverageWeight && cargo2Volume < maxAverageVolume}")
}
