package edu.example.operators

fun main (){
    //aprendiendo del la nulabilidad
    //por defecto las variables no pueden ser null en kotlin
    //var rocks: Int = null  una variable tipo entero es no null entonces no deberia de tener un valor null asignado
    var marbles: Int? = null // el signo ? se puede usar para que una varaible se le asigne el valor nulo


    //uso de operador ? y ?: como un if
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }

    var fishFoodTreats2 =6
    //fishFoodTreats2 = fishFoodTreats2?.dec() aqui no habria una forma de if por la falta de : y el decremento no corre
    fishFoodTreats2 =fishFoodTreats2?.dec()?: 0


    //double bang
    //val len = s!!.length   // throws NullPointerException if s is null

}