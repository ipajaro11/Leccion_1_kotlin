package edu.example.leccion2funciones

fun main (){
    println ("\nTaller: Laboratorio de Automatizacion\n")

    //PASO 1 CREACION DE LISTA DE INSTRUMENTOS
    val instrumentos = listOf(
        Pair("Osciloscopio digital", 1500.00),
        Pair("Voltimtro digital", 120.00),
        Pair("Generador de ondas", 980.00),
        Pair("Cable BNC", 15.00),
        Pair("Resistencia 1k", 0.10),
        Pair("Protoboard", 25.00)
    )

    //MINIRETO DEL PASO 1
    instrumentos.forEach { println("${it.first} -> ${it.second}") }


    //PASO 2 USANDO FILTER CON LAMBDA
    val costos = instrumentos.filter{it.second > 500}
    println("\nInstrumentos costos (> 500):")
    costos.forEach {println(it.first)}

    //MINIRETO DEL PASO 2
    val costos2 = instrumentos.filter{it.second > 100}
    println("\nInstrumentos costos (> 100):")
    costos2.forEach {println(it.first)}


    //PASO 3 USANDO .map
    val nombres = instrumentos.map { it.first }
    println("\nNombres de instrumentos:")
    nombres.forEach { println(it) }

    //MINIRETO
    val Nombres2 = instrumentos.map {it.first}
    val Precios = instrumentos.map {it.second}
    println("\nNombres de instrumentos y precios:")
    instrumentos.forEach{(Nombres2, Precios) -> println("$Nombres2 cuesta $Precios")}


    //PASO 4 USANDO sumOf
    val total = instrumentos.sumOf { it.second }
    println("\nCosto total del laboratorio: $total")

    //MINIRETO PASO 4
    val filtro = instrumentos.filter {it.second > 100} .sumOf {it.second}
    println("La suma de los instrumentos > 100 es: $filtro")


    //PASO 5 ORDENAR POR PRECIO
    val ordenados = instrumentos.sortedBy {it.second}
    println("\nInstrumentos ordenados por precio:") //de menor a mayor
    ordenados.forEach { println("${it.first} - ${it.second}") }

    //MINIRETO PASO 5
    val orden = instrumentos.sortedByDescending {it.second}
    println("\nInstrumentos ordenados con sortedByDescending") //de mayor a menor
    orden.forEach {println("${it.first} - ${it.second}")}


    //PASO 6 CREAR UNA FUNCIÓN DE ÓRDEN SUPERIOR FILTRAR (FUNCION DEBAJO DEL MAIN)
    val costosos2 = filtrarInstrumentos(instrumentos) { it.second > 500 }
    println("\n(Con funcion de orden superior) Costosos (> 500):")
    costosos2.forEach { println(it.first) }

    //MINIRETO PASO 6
    val cables = filtrarInstrumentos(instrumentos) { it.first.contains("Cable")}
    println("\nLa palabra filtrada es: :")
    cables.forEach { println("${it.first} - ${it.second}") }


    //PASO 7 CREAR UNA FUNCIÓN DE ÓRDEN SUPERIOR TRANSFORMAR (FUNCIÓN DEBAJO DEL MAIN)
    val nombres2 = transformarInstrumentos(instrumentos) { it.first }
    println("\n(Con funcion de orden superior) Nombres:")
    nombres2.forEach { println(it) }

    //MINIRETO PASO 7
    val precios = transformarInstrumentos(instrumentos){it.second}
    println("\n(Con funcion orden superior) Precios")
    precios.forEach { println(it) }


    //PASO 8 CREAR FUNCIÓN DE ÓRDEN SUPERIOR CÁLCULO TOTAL (DEBAJO DEL MAIN)
    val total2 = calcular(instrumentos){lista -> lista.sumOf { it.second }}
    println("\n(con funcion de orden superior) Total: $total2")

    //MINIRETO DEL PASO 8
    val totalMedicion = calcular(instrumentos) {lista ->lista.filter { it.first.contains("digital")}.sumOf { it.second }}
    println("\n(con funcion de orden superior) Total equipo de medicion: $totalMedicion")
}
//funcion del paso 6
fun filtrarInstrumentos(
    lista: List<Pair<String, Double>>,
    criterio: (Pair<String, Double>) ->Boolean): List<Pair<String, Double>>{
    return lista.filter(criterio)
}

//funcion del paso 7
fun <T> transformarInstrumentos(
    lista: List<Pair<String, Double>>,
    transformacion: (Pair<String, Double>) -> T): List<T>{
    return lista.map(transformacion)
}

//funcion del paso 8
fun calcular(
    lista: List<Pair<String,Double>>,
    operacion: (List<Pair<String, Double>>) ->Double): Double{
        return operacion(lista)
    }
