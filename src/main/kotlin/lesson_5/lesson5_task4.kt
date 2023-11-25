package lesson_5

fun main() {
    println("Добро пожаловать на борт корабля Heart of Gold!")
    print("Введите своё имя пользователя: ")
    val enteredUsername = readln()

    if (enteredUsername == REGISTERED_USERNAME) {
        print("Введите пароль: ")
        val enteredPassword = readln()

        if (enteredPassword == REGISTERED_PASSWORD) {
            println("[вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь $enteredUsername, " +
                    "вам разрешено входить на борт корабля \"Heart of Gold\". Хотя мне всё равно... \n" +
                    "Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...] " +
                    "Надеюсь, вам понравится пребывание здесь больше, чем мне.")
        } else {
            println("Неверный пароль. Доступ запрещен.")
        }
    } else {
        println("Пользователь $enteredUsername не зарегистрирован. Желаете зарегистрироваться?")
    }
}

    const val REGISTERED_USERNAME = "Zaphod"
    const val REGISTERED_PASSWORD = "PanGalactic"
