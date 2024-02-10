package lesson21

import java.io.File
import java.io.FileWriter
import java.util.*

fun File.writeWordToBeginning(word: String) {
    val originalContent = this.readText()
    val lowerCaseWord = word.lowercase(Locale.getDefault())
    val newContent = "$lowerCaseWord\n$originalContent"

    FileWriter(this).use { writer ->
        writer.write(newContent)
    }
}

fun main() {
    val file = File("example.txt")
    val word = "Hello"

    file.writeWordToBeginning(word)
    println("Word '$word' has been written to the beginning of the file '${file.name}'.")
}
