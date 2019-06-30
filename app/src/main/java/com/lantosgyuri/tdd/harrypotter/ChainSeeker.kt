package com.lantosgyuri.tdd.harrypotter

import com.lantosgyuri.tdd.harrypotter.data.Book
import com.lantosgyuri.tdd.harrypotter.data.DiscountChain

interface ChainSeeker {
    fun seekChains(books: List<Book>) : List<DiscountChain>
}