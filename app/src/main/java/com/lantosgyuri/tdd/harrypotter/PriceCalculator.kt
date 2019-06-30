package com.lantosgyuri.tdd.harrypotter

import com.lantosgyuri.tdd.harrypotter.data.DiscountChain


interface PriceCalculator {
    fun getPrice(list: List<DiscountChain>) : Double
}