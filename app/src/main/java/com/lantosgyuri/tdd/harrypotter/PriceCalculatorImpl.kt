package com.lantosgyuri.tdd.harrypotter

import com.lantosgyuri.tdd.harrypotter.data.DiscountChain


class PriceCalculatorImpl : PriceCalculator {
    val basePrice = 8.0
    override fun getPrice(list: List<DiscountChain>): Double {
        var price = 0.0

        for(item in list){
            when (item){
                is DiscountChain.NoDiscount -> price += basePrice
                is DiscountChain.ChainOfTwo -> price +=  2*basePrice*0.95
                is DiscountChain.ChainOfThree -> price += 3*basePrice*0.9
                is DiscountChain.ChainOfFour -> price += 4*basePrice*0.8
                is DiscountChain.ChainOfFive -> price += 5*basePrice*0.75
            }
        }

        return price
    }
}