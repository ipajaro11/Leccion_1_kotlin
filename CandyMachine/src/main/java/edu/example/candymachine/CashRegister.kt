package edu.example.candymachine

class CashRegister {
    private var cashOnHand: Int

    constructor (){
        cashOnHand = 500
    }

    constructor (cashIn: Int){
        if (cashIn >= 0)
        {
            cashOnHand = cashIn
        }
        else {
            cashOnHand = 500
        }
    }

    fun currentBalance(): Int{
        return cashOnHand
    }

    fun acceptAmount (amountIn: Int){
        cashOnHand = cashOnHand + amountIn
    }
}