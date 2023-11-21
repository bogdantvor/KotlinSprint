package lesson_4

fun main() {
    val trainingDay = 5

    val armAndAbsDay = trainingDay % 2 == 1
    val legAndBackDay = trainingDay % 2 == 0

    println(
        """
        Упражнения для рук:     $armAndAbsDay
        Упражнения для ног:     $legAndBackDay
        Упражнения для спины:   $legAndBackDay
        Упражнения для пресса:  $armAndAbsDay
        """
    )
}
