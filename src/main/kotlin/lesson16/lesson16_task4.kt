package lesson16

class Order(private val orderNumber: Int, private var status: String) {
    fun getStatus(): String {
        return status
    }

    fun getOrderNumber(): Int {
        return orderNumber
    }

    private fun changeStatus(newStatus: String) {
        status = newStatus
        println("Статус заказа №$orderNumber изменен на: $newStatus")
    }

    fun requestStatusChange(newStatus: String) {
        changeStatus(newStatus)
    }
}

fun main() {
    val order = Order(123, "В обработке")
    println("Текущий статус заказа №${order.getOrderNumber()}: ${order.getStatus()}")
    order.requestStatusChange("Отправлен")
    println("Новый статус заказа №${order.getOrderNumber()}: ${order.getStatus()}")
}
