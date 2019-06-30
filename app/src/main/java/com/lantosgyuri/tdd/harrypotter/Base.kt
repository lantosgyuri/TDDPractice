package com.lantosgyuri.tdd.harrypotter

import com.lantosgyuri.tdd.harrypotter.data.Book
import com.lantosgyuri.tdd.harrypotter.data.DiscountChain

class Base(
    val chainSeeker: ChainSeeker,
    val priceCalculator: PriceCalculator
){
    fun getPrice(bookList: List<Book>): Double{
        val list = chainSeeker.seekChains(bookList)
        return priceCalculator.getPrice(list)
    }

}