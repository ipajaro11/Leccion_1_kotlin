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

    fun increaseDirty( start: Int ) = start + 1


    fun main (){
        val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
        println(updateDirty(30, waterFilter))
        println(updateDirty(15, ::increaseDirty))

        var dirtyLevel = 19
        dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
        println(dirtyLevel)
    }