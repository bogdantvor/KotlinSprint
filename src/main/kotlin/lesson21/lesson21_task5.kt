package lesson21

fun <K, V : Comparable<V>> Map<K, V>.maxCategory(): K? {
    return maxByOrNull { it.value }?.key
}

fun main() {
    val skills = mapOf(
        "Strength" to 50,
        "Agility" to 70,
        "Intelligence" to 60,
        "Endurance" to 70
    )

    val maxSkill = skills.maxCategory()
    println("Максимальный навык: $maxSkill")
}
