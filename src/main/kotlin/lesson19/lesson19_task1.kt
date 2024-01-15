package lesson19

enum class FishType {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH
}

fun main() {
    println("Вы можете добавить следующих рыб в свой аквариум:")
    for (fish in FishType.values()) {
        println(fish)
    }
}
