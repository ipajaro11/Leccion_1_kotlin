package edu.example.operators

fun main (){
    //haceindo listas
    val school = listOf("mackerel", "trout", "halibut")
    println(school)

    val mylist = mutableListOf("tuna", "salmon", "shark")
    mylist.remove("shark")
    println(mylist)

}