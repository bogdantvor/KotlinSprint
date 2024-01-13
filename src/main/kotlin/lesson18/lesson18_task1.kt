package lesson18

class OrderPrinter {

    fun printOrderInfo(orderNumber: Int, itemName: String) {
        println("Заказан товар: $itemName")
    }

    fun printOrderInfo(orderNumber: Int, items: List<String>) {
        val itemsString = items.joinToString(", ")
        println("Заказаны следующие товары: $itemsString")
    }
}

fun main() {
    val orderPrinter = OrderPrinter()

    orderPrinter.printOrderInfo(orderNumber = 123, itemName = "Книга")

    orderPrinter.printOrderInfo(orderNumber = 124, listOf("Флешка", "Наушники", "Клавиатура"))
}
