package lesson_4

fun main() {
    print("Наличие повреждений корпуса (true/false): ")
    val damagedHull = readLine()?.toBoolean() ?: false

    print("Текущий состав экипажа: ")
    val crewSize = readLine()?.toInt() ?: 0

    print("Количество ящиков с провизией на борту: ")
    val provisionsBoxes = readLine()?.toInt() ?: 0

    print("Благоприятность метеоусловий (true/false): ")
    val favorableWeather = readLine()?.toBoolean() ?: false

    val canSail = (!damagedHull && crewSize in MIN_CREW..MAX_CREW && provisionsBoxes > MIN_PROVISIONS_BOXES)
            || (favorableWeather && crewSize == MAX_CREW && provisionsBoxes >= MIN_PROVISIONS_BOXES)

    println("Корабль может отправиться в плавание: $canSail")
}

    const val MIN_CREW = 55
    const val MAX_CREW = 70
    const val MIN_PROVISIONS_BOXES = 50