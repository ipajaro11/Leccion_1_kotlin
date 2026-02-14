package edu.example.operators

fun main (){
    //haceindo listas
    val school = listOf("mackerel", "trout", "halibut")
    println(school)

    val mylist = mutableListOf("tuna", "salmon", "shark")
    mylist.remove("shark")
    println(mylist)

    val school1 = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school1))

    val mix = arrayOf("fish", 2)  //Aqui no se imprime los valores como dice en el curso de kotlin
    println(mix)

    val numbers = intArrayOf(1,2,3)
    println(numbers)

    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])

    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)

    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))


    //Creando loops

    val school2 = arrayOf("shark", "salmon", "minnow")
    for (element in school2) {
        print(element + " ")
    }

    for ((index, element) in school2.withIndex()) {
        println("Item at $index is $element\n")
    }

for (i in 1..5) print(i)

    for (i in 5 downTo 1) print(i)

    for (i in 3..6 step 2) print(i)

    for (i in 'd'..'g') print (i)

    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }

}