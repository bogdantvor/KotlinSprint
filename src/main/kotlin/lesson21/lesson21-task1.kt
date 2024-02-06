package lesson21

fun String.vowelCount(): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y')
    return count { it in vowels }
}

fun main() {
    val inputString = "hello"
    val result = inputString.vowelCount()
    println("Количество гласных в строке \"$inputString\" равно $result.")
}
