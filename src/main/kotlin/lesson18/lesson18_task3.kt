package lesson18

open class Animal(val name: String) {
    open fun playing() {
        println("$name - играет")
    }
    open fun sleeping() {
        println("$name - спит")
    }
    open fun eating() {
        println("$name - ест")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eating() {
        println("$name - ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eating() {
        println("$name - ест кости")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eating() {
        println("$name - ест рыбу")
    }
}

fun main() {
    val fox = Fox("Foxy")
    val dog = Dog("Doggy")
    val cat = Cat("Tom")

    fox.sleeping()
    fox.playing()
    fox.eating()

    dog.sleeping()
    dog.playing()
    dog.eating()

    cat.sleeping()
    cat.playing()
    cat.eating()
}
