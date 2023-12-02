package lesson_4

fun main() {
    val trainingDay = 5
    val isEven = trainingDay % 2 == 0
    val armAndAbsDay = !isEven
    val legAndBackDay = isEven

    println(
        """
        Упражнения для рук:     $armAndAbsDay
        Упражнения для ног:     $legAndBackDay
        Упражнения для спины:   $legAndBackDay
        Упражнения для пресса:  $armAndAbsDay
        """
    )
}
