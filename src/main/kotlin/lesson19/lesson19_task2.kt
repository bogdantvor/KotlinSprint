package lesson19

enum class ProductCategory {
    CLOTHING,
    STATIONERY,
    MISCELLANEOUS;

    fun getCategoryName(): String {
        return when (this) {
            CLOTHING -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            MISCELLANEOUS -> "Разное"
        }
    }
}

class Product(val name: String, private val id: Int, private val category: ProductCategory) {
    fun displayInfo() {
        println("Товар: $name")
        println("ID: $id")
        println("Категория: ${category.getCategoryName()}")
        println()
    }
}

fun main() {
    val product1 = Product("Футболка", 1, ProductCategory.CLOTHING)
    val product2 = Product("Ручка", 2, ProductCategory.STATIONERY)
    val product3 = Product("Кружка", 3, ProductCategory.MISCELLANEOUS)

    product1.displayInfo()
    product2.displayInfo()
    product3.displayInfo()
}
