package lesson14

open class CelestialBody(val name: String, val hasAtmosphere: Boolean, val suitableForLanding: Boolean)

class Planet(name: String, hasAtmosphere: Boolean, suitableForLanding: Boolean, val satellites: List<Satellite>) :
    CelestialBody(name, hasAtmosphere, suitableForLanding)

class Satellite(name: String, hasAtmosphere: Boolean, suitableForLanding: Boolean) :
    CelestialBody(name, hasAtmosphere, suitableForLanding)

fun main() {
    val satellite1 = Satellite(name = "Phobos", hasAtmosphere = false, suitableForLanding = true)
    val satellite2 = Satellite(name = "Deimos", hasAtmosphere = false, suitableForLanding = false)

    val mars = Planet(name = "Mars", hasAtmosphere = true, suitableForLanding = true, listOf(satellite1, satellite2))

    println("Planet: ${mars.name}")
    println("Satellites: ${mars.satellites.map{ it.name }.joinToString(", ")}")
}
