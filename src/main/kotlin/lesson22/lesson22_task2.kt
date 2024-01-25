package lesson22

class RegularBookTask2(val title: String, val author: String)

data class DataBookTask2(val title: String, val author: String)

fun main() {
    val regularBookTask2 = RegularBookTask2("Book Title", "Author Name")

    val dataBookTask2 = DataBookTask2("Book Title", "Author Name")

    println("Объект RegularBookTask2: $regularBookTask2")
    println("Объект DataBookTask2: $dataBookTask2")

    /* Для RegularBookTask2 выводится хэш-код объекта, поскольку не переопределен
    метод toString(). По умолчанию будет вызван метод toString(), который выводит
    название класса и хэш-код объекта */

    /* Для DataBookTask2 data класс автоматически переопределяет метод toString(),
    поэтому вывод объекта будет содержать значения его свойств */
}
