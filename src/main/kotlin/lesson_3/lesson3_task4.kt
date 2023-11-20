package lesson_3

fun main() {
    var moveFrom = "E2"
    var moveTo = "E4"
    var moveNumber = 1

    var chessMove = "$moveFrom-$moveTo;$moveNumber"
    println(chessMove)

    moveFrom = "D2"
    moveTo = "D3"
    moveNumber++
    chessMove = "$moveFrom-$moveTo;$moveNumber"
    println(chessMove)
}