package lesson20

fun main() {
    val elements = listOf("A", "B", "C", "D", "E", "F", "G", "H")

    val lambdas = elements.mapIndexed { index, element ->
        if (index % 2 == 0) {
            { println("Нажат элемент $element") }
        } else {
            {}
        }
    }

    for (lambda in lambdas) {
        lambda.invoke()
    }
}
