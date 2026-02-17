package edu.example.leccion2funciones

//Creando un filtro, se elige el en que posición de la letra para filtrar
val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
fun main() {
    println( decorations.filter {it[1] == 'l'})
}

//comparando