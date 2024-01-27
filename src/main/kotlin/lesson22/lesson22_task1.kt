package lesson22

class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)

fun main() {
    val regularBook1 = RegularBook("Book Title", "Author Name")
    val regularBook2 = RegularBook("Book Title", "Author Name")

    val dataBook1 = DataBook("Book Title", "Author Name")
    val dataBook2 = DataBook("Book Title", "Author Name")

    println("Сравнение RegularBook:")
    println(regularBook1 == regularBook2)

    println("\nСравнение DataBook:")
    println(dataBook1 == dataBook2)

    /* Для RegularBook сравнение происходит по ссылкам на объекты, и поэтому
    результат false, даже если свойства объектов равны */

    /* Data класс позволяет сравнить именно проинициализированные данные, поэтому
    сравнение для DataBook будет true, так как свойства объектов идентичны */
}
