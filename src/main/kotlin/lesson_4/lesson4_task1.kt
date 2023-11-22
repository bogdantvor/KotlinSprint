package lesson_4

fun main() {
    val freeTablesToday = 0
    val freeTablesTomorrow = 4

    println("Доступность столиков на сегодня: ${TOTAL_TABLES > TOTAL_TABLES - freeTablesToday}\n" +
            "Доступность столиков на завтра: ${TOTAL_TABLES > TOTAL_TABLES - freeTablesTomorrow}")
}

    const val TOTAL_TABLES = 13