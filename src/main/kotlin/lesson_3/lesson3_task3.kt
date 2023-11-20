package lesson_3

fun main() {
    val multiplicationNumber = 3 // Ваше число

    val table = StringBuilder()
    var index = 0
    repeat(9) {
        index++
        val result = multiplicationNumber * index
        table.append("$multiplicationNumber x $index = $result\n")
    }

    println(table)
}