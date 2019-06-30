package com.lantosgyuri.tdd.harrypotter

import com.lantosgyuri.tdd.harrypotter.data.Book
import com.lantosgyuri.tdd.harrypotter.data.DiscountChain
import com.lantosgyuri.tdd.harrypotter.data.DiscountChain.*
import java.util.concurrent.ConcurrentHashMap

class ChainSeekerImpl : ChainSeeker {

    override fun seekChains(books: List<Book>): List<DiscountChain> {
        val titles = getTitles(books)
        val booksPerTitle = getItemsPerTitle(books, titles)

        return calculateDiscountChains(booksPerTitle)
    }

    fun getTitles(books: List<Book>): List<String> {
        val titleList = ArrayList<String>()
        for (item in books) titleList.add(item.title)
        return titleList.distinct()
    }

    fun getItemsPerTitle(books: List<Book>, title: List<String>): Map<String, Int> {
        val mapOfBooks = HashMap<String, Int>()
        for (itemTitle in title) {
            var counter = 0
            for (itemBook in books) {
                if (itemTitle == itemBook.title) counter++
            }

            mapOfBooks.put(itemTitle, counter)
        }
        return mapOfBooks
    }

    fun calculateDiscountChains(booksPerTitle: Map<String, Int>): List<DiscountChain> {
        val discountChainList = ArrayList<DiscountChain>()
        val cloneBooksPerTitle = cloneMap(booksPerTitle)

        while(cloneBooksPerTitle.size> 0) {
            when (cloneBooksPerTitle.size) {
                5 -> discountChainList.add(ChainOfFive())
                4 -> discountChainList.add(ChainOfFour())
                3 -> discountChainList.add(ChainOfThree())
                2 -> discountChainList.add(ChainOfTwo())
                1 -> discountChainList.add(NoDiscount())
            }
            cloneBooksPerTitle.replaceAll { _, value ->  value -1 }
            for(item in cloneBooksPerTitle){
                if(item.value == 0 ) cloneBooksPerTitle.remove(item.key)
            }
        }
        return discountChainList
    }

    private fun cloneMap(booksPerTitle: Map<String, Int>): ConcurrentHashMap<String, Int> {
        val cloneBooksPerTitle = ConcurrentHashMap<String, Int>()
        for (item in booksPerTitle) {
            cloneBooksPerTitle.put(item.key, item.value)

        }
        return cloneBooksPerTitle
    }
}