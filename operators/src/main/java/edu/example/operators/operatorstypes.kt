package edu.example.operators

fun main (){
    println(1+1)
    println(53-3)
    println(50/10)
    println(1.0/2.0)
    println(2.0*3.5)

    println(6*50)
    println(6.0*50.0)
    println(6.0*50)

    println(2.times(3))
    println(3.5.plus(4))
    println(2.4.div(2))

    val i: Int =6
    val b1 = i.toByte()
    println(b1)
    val b2: Byte = 1
    println(b2)

    //val i1: Int = b2
    //val i2: String =b2
    //val i3: Double = b2
    //Estas tres lineas de codigo arriba escritas tienen un error porque se desea imprmirlas en un cierto tipo de variable cuando el original es de tipo Byte

    //para evitar esos errores se hace un casting de la siguiente manera

    val i4: Int = b2.toInt()
    println(i4)
    val i5: String = b2.toString()
    println(i5)
    val i6: Double = b2.toDouble()
    println(i6)

    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println(oneMillion)
    println(socialSecurityNumber)
    println(hexBytes)
    println(bytes)
}