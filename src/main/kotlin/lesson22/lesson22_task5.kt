package lesson22

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: String,
    val distanceFromEarth: Double
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Зарождение Нового Сознания на Alpha Centauri",
        description = "Событие, известное как \"Зарождение Нового Сознания\", стало причиной радикальных изменений " +
                "в обществах звездной системы. Одиночные интеллектуальные существа теперь могут обмениваться идеями " +
                "и знаниями напрямую через свои разумы, что ускорило развитие технологий, искусства и науки",
        dateTime = "2350 год",
        distanceFromEarth = 4.37
    )

    val (name, description, dateTime, distanceFromEarth) = alphaCentauri

    println("Событие: $name")
    println("Описание: $description")
    println("Дата: $dateTime")
    println("Расстояние от Земли: $distanceFromEarth световых лет")
}
