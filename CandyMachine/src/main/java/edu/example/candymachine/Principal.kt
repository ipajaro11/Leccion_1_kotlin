package edu.example.candymachine
import java.util.Scanner

fun showSelection(){
    println("***Welcome to Shelly's Candy Shoop***")
    println("To select an item, enter")
    println("1 for Candy")
    println("2 for Chips")
    println("3 for Gum")
    println("4 for Cookies")
    println("9 to exit")
}

fun sellProduct (product: Dispenser, cRegister: CashRegister){
    var price: Int
    var coinsInserted: Int
    var coinsRequired: Int

    if(product.getCount() > 0){
        price = product.getProductCost()
        coinsRequired = price
        coinsInserted = 0

        while (coinsRequired > 0)
        {
            val console = Scanner(System.`in`)
            print("Please deposit " + coinsRequired + " cents: ")
            coinsInserted = coinsInserted + console.nextInt()
            coinsRequired = price-coinsInserted
        }
        println()
        cRegister.acceptAmount(coinsInserted)
        product.makeSale()
        println("Collect your item at the bottom and enjoy.\n")
    }
    else{
        println("Sorry this item is sold out.\n")
    }
}

fun main (){
    var cashRegister = CashRegister()
    var candy = Dispenser (100,50)
    var chips = Dispenser (100,65)
    var gums = Dispenser (75,45)
    var cookies = Dispenser (100,85)
    val console = Scanner(System.`in`)
    var choice: Int

    showSelection()
    choice = console.nextInt()

    while (choice != 9){
        when (choice){
            1 -> sellProduct(candy, cashRegister)
            2 -> sellProduct(chips,cashRegister)
            3 -> sellProduct(gums, cashRegister)
            4 -> sellProduct(cookies, cashRegister)
            else -> println("Invalid selection")
        }
        showSelection()
        choice = console.nextInt()
    }
}