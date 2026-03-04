package edu.example.candymachine

fun candyMachine()
{
    val myCandyMachine = CashRegister()
    myCandyMachine.currentBalance()
    myCandyMachine.acceptAmount(amountIn = 200)
}

fun main(){
    candyMachine()
}