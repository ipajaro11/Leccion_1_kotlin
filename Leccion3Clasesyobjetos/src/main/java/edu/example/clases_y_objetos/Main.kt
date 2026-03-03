package edu.example.clases_y_objetos

//Paso 1 crenado un constructor
fun buildAquarium() {
    val myAquarium = aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()

    //paso 2
    val aquarium1 = aquarium()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = aquarium(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = aquarium(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    //Paso 3
    val aquarium6 = aquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()
    //println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} liters")

}

fun main() {
    buildAquarium()
}