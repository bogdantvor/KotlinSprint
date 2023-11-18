package lesson_3

fun main() {
    val chessMoveString = "D2-D4;0"

    val (fromTo, moveNumber) = chessMoveString.split(";")
    val (from, to) = fromTo.split("-")

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $moveNumber")

}