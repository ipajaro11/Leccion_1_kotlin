package edu.example.leccion2funciones
/*
fun main () {
    //iniciando con lambdas
    var dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2 }
    println(waterFilter(dirtyLevel))

    val waterFilter2: (Int) -> Int = { dirty -> dirty / 2 }
    println(waterFilter2(dirtyLevel))
}
*/

    //creando una funcion de mas alto orden
    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }

/*
    fun increaseDirty( start: Int ) = start + 1


    fun main (){
        val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
        println(updateDirty(30, waterFilter))
        println(updateDirty(15, ::increaseDirty))

        var dirtyLevel = 19
        dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
        println(dirtyLevel)
    }

 */

/*fun calcularArea (base : Int, altura : Int): Int {
    val area = base*altura
    return area
}

fun main (){
    val base = 5
    val altura =8
    val area = calcularArea(base, altura)
    println(area)
}

 */


//preguntas de cuestionario
fun costo(precio: Double, impuesto: Double = 0.16): Double {
    return precio * (1 + impuesto)
}

fun main() {
    val precio: Double = 100.0
    val impuesto: Double = 0.08
    println(costo (precio))
    println(costo(precio, impuesto))
}
