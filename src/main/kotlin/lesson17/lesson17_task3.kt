package lesson17

class CloudFolder(val name: String, private val fileCount: Int, private val isSecret: Boolean) {

    val numberOfFiles: Int
        get() {
            return if (isSecret) {
                0
            } else {
                fileCount
            }
        }

    val folderName: String
        get() {
            return if (isSecret) {
                "Скрытая папка"
            } else {
                name
            }
        }
}

fun main() {
    val secretFolder = CloudFolder(name = "SecretFolder", fileCount = 10, isSecret = true)

    println("Имя папки: ${secretFolder.folderName}")
    println("Количество файлов: ${secretFolder.numberOfFiles}")
}
