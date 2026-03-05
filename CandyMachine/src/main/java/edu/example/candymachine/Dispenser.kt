package edu.example.candymachine

class Dispenser {
    private var numberOfItems: Int
    private var cost: Int

    constructor(){
        numberOfItems = 50
        cost = 50
    }

    constructor(setNoOfItems: Int, setCost: Int){
        if(setNoOfItems >= 0)
            numberOfItems = setNoOfItems
        else
            numberOfItems = 50

        if(setCost>=0)
            cost=setCost
        else
            cost = 50
    }

    fun getCount (): Int{
        return numberOfItems
    }

    fun getProductCost(): Int{
        return cost
    }

    fun makeSale (){
        numberOfItems--
    }
}