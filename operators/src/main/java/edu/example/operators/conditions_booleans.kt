package edu.example.operators

fun main (){
    //Use of if, and operators <>
    val numberOfFish = 50
    val numberOfPlants = 23
    if(numberOfFish > numberOfPlants){
        println("Good ratio!")
    }
    else {
        println("Unhealthy ratio!")
    }


    //use of operator .. it is about if a number is in a range of numbers
    val fish = 50
    if (fish in 1..100){
        println(fish)
    }


    //use of comparator == and if in multiple cases
    if(numberOfFish == 0){
        println("Empty tank")
    }
    else if (numberOfFish < 40){
        println("Got fish!")
    }
    else{
        println("That's a lot of fish")
    }

    //use of when conditional and another form of print the sentences
    when(numberOfFish){
        0 -> println("Empty tank")
        in 1.. 39 -> println("Got fish!")
        else -> println("That's a lot of fish")
    }
}