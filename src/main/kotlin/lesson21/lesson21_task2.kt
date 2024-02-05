package lesson21

fun List<Int>.evenNumbersSum(): Int {
    return filter { it % 2 == 0 }.sum()
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result = numbers.evenNumbersSum()
    println("Сумма всех четных чисел в списке $numbers равна $result")
}
