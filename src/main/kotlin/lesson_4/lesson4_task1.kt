package lesson_4

fun main() {
    val freeTablesToday = 0
    val freeTablesTomorrow = 4
    val reservedTablesToday = TOTAL_TABLES - freeTablesToday
    val reservedTablesTomorrow = TOTAL_TABLES - freeTablesTomorrow

    println("Доступность столиков на сегодня: ${TOTAL_TABLES > reservedTablesToday}\n" +
            "Доступность столиков на завтра: ${TOTAL_TABLES > reservedTablesTomorrow}")
}

    const val TOTAL_TABLES = 13