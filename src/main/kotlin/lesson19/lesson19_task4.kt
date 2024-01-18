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
        if (currentAmmo == null) {
            println("Танк не заряжен патронами")
        } else {
            val damage = currentAmmo!!.damage
            println("Выстрел! Нанесен урон: $damage единиц")
        }
    }
}

fun main() {
    val tank = Tank()

    tank.fire()

    tank.armWithAmmo(AmmoType.BLUE)
    tank.fire()

    tank.armWithAmmo(AmmoType.GREEN)
    tank.fire()

    tank.armWithAmmo(AmmoType.RED)
    tank.fire()
}
