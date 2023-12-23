package lesson15

interface Searchable {
    fun searchComponents()
}

abstract class Product(val name: String, var quantity: Int)

class Instrument(name: String, quantity: Int) : Product(name, quantity), Searchable {
    override fun searchComponents() {
        println("Выполняется поиск компонентов для инструмента: $name")
    }
}

class Accessory(name: String, quantity: Int) : Product(name, quantity)

fun main() {
    val guitar = Instrument("Гитара", 10)
    val drum = Instrument("Барабаны", 5)

    val strings = Accessory("Струны", 100)
    val drumSticks = Accessory("Барабанные палочки", 50)

    val products: List<Product> = listOf(guitar, drum, strings, drumSticks)

    for (product in products) {
        if (product is Searchable) {
            product.searchComponents()
        }
    }
}
