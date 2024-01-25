package lesson19

enum class AmmoType(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank {
    private var currentAmmo: AmmoType? = null

    fun armWithAmmo(ammoType: AmmoType) {
        currentAmmo = ammoType
        println("Танк вооружен ${ammoType.name} патронами")
    }

    fun fire() {
        currentAmmo?.damage
            ?.also {
                println("Выстрел! Нанесен урон: $it единиц")
                currentAmmo = null // обнуляем после выстрела
            }
            ?: println("Танк не заряжен патронами")
    }
}

fun main() {
    val tank = Tank()

    tank.fire()

    tank.armWithAmmo(AmmoType.BLUE)
    tank.fire()
    tank.fire()

    tank.armWithAmmo(AmmoType.GREEN)
    tank.fire()
    tank.fire()

    tank.armWithAmmo(AmmoType.RED)
    tank.fire()
    tank.fire()
}
