package lesson_4

fun main() {
    val totalTables = 13
    val reservedTablesToday = totalTables
    val reservedTablesTomorrow = totalTables - 4

    println("Доступность столиков на сегодня: ${totalTables > reservedTablesToday}\n" +
            "Доступность столиков на завтра: ${totalTables > reservedTablesTomorrow}")
}