package edu.example.operators

fun main (){
    var nombres = mutableListOf("Mariano", "Sandra", "Carlos", "Alondra")
    var edad = mutableListOf(13,17,28,72)
    var correo = mutableListOf("mariano@hotmail.com",null,"carlos@yahoo.com",null)
    var suscripcion = mutableListOf(true,true,false,false)
    var Emailverify: String=""

    for(i in 0..3) {
        if (esMayorDeEdad(edad[i])) {
            println("\n" + nombres[i] + ": Acceso permitido")
        } else {
            println("\n" + nombres[i] + ": Acceso denegado")
        }

        when (edad[i]) {
            in 0..13 -> println("Nino")
            in 13..17 -> println("Adolescente")
            in 18..64 -> println("Adulto")
            else -> println("Adulto mayor")
        }

        if (suscripcion[i] == true){
            println("Suscrito")
            }
        else println("No suscrito")

        Emailverify=correo[i]?:"Email no registrado"
        println("Correo electronico: " + Emailverify)
    }
}

fun esMayorDeEdad (edades: Int): Boolean{
    return edades >=18
}
