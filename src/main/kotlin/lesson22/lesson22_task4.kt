package lesson22

data class MainScreenState(val data: String?, val isLoading: Boolean = false)

class MainScreenViewModel {
    private var mainScreenState: MainScreenState = MainScreenState(null)

    fun loadData() {
        mainScreenState = MainScreenState(data = null, isLoading = false)
        println("Новое состояние экрана: $mainScreenState")

        Thread.sleep(1000)

        mainScreenState = mainScreenState.copy(data = "Данные загружаются", isLoading = true)
        println("Новое состояние экрана: $mainScreenState")

        Thread.sleep(1000)

        mainScreenState = mainScreenState.copy(data = "Данные загружены", isLoading = false)
        println("Новое состояние экрана: $mainScreenState")
    }
}

fun main() {
    val mainScreenViewModel = MainScreenViewModel()

    mainScreenViewModel.loadData()
}
