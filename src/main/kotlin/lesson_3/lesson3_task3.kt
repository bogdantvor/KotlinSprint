package lesson_3

fun main() {
    val multiplicationNumber = 3 // Ваше число

    val table = StringBuilder()
    repeat(9) { i ->
        val result = multiplicationNumber * (i + 1)
        table.append("$multiplicationNumber x ${i + 1} = $result\n")
    }

    println(table)
}