package lesson_4

fun main() {
    print("Наличие повреждений корпуса (true/false): ")
    val isDamaged = readln().toBoolean()

    print("Текущий состав экипажа: ")
    val crewSize = readln().toInt()

    print("Количество ящиков с провизией на борту: ")
    val provisionsBoxes = readln().toInt()

    print("Благоприятность метеоусловий (true/false): ")
    val isWeatherFavorable = readln().toBoolean()

    val canSail = (!isDamaged && crewSize in MIN_CREW..MAX_CREW && provisionsBoxes > MIN_PROVISIONS_BOXES)
            || (isWeatherFavorable && crewSize == MAX_CREW && provisionsBoxes >= MIN_PROVISIONS_BOXES)

    println("Корабль может отправиться в плавание: $canSail")
}

    const val MIN_CREW = 55
    const val MAX_CREW = 70
    const val MIN_PROVISIONS_BOXES = 50