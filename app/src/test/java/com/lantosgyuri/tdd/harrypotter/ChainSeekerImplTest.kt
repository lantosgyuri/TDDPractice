package com.lantosgyuri.tdd.harrypotter

import com.lantosgyuri.tdd.harrypotter.data.Book
import com.lantosgyuri.tdd.harrypotter.data.DiscountChain.*
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ChainSeekerImplTest{

    lateinit var SUT: ChainSeekerImpl
    val expectedMap = HashMap<String, Int>()

    @Before
    fun setUp() {
        SUT = ChainSeekerImpl()
    }

    @Test
    fun getTitles(){
        val result = SUT.getTitles(listOfBooks)
        assertEquals(expectedList, result)
    }

    @Test
    fun getItemsPerTitle(){
        expectedMap.put("z", 4)
        expectedMap.put("i", 3)
        expectedMap.put("l", 3)
        expectedMap.put("t",2)
        expectedMap.put("o", 2)
        val result = SUT.getItemsPerTitle(listOfBooks,expectedList)
        assertEquals(expectedMap, result)
    }

    @Test
    fun seekForChains(){
        expectedMap.put("z", 4)
        expectedMap.put("i", 3)
        expectedMap.put("l", 3)
        expectedMap.put("t",2)
        expectedMap.put("o", 2)
        val result = SUT.calculateDiscountChains(expectedMap)
        assertEquals(expectedDiscountChainList, result)
    }

    @Test
    fun seekForChains_return_ChainOfFive(){
        expectedMap.put("z", 2)
        expectedMap.put("i", 2)
        expectedMap.put("l", 2)
        expectedMap.put("t",2)
        expectedMap.put("o", 2)
        val result = SUT.calculateDiscountChains(expectedMap)
        assertEquals(listOf(ChainOfFive(), ChainOfFive()), result)
    }

    @Test
    fun seekForChains_return_ChainOfFour(){
        expectedMap.put("z", 1)
        expectedMap.put("i", 1)
        expectedMap.put("l", 1)
        expectedMap.put("t",1)
        val result = SUT.calculateDiscountChains(expectedMap)
        assertEquals(listOf(ChainOfFour()), result)
    }
    @Test
    fun seekForChains_return_ChainOfThree(){
        expectedMap.put("z", 1)
        expectedMap.put("i", 1)
        expectedMap.put("l", 1)
        val result = SUT.calculateDiscountChains(expectedMap)
        assertEquals(listOf(ChainOfThree()), result)
    }
    @Test
    fun seekForChains_return_ChainOfTwo(){
        expectedMap.put("z", 1)
        expectedMap.put("i", 1)
        val result = SUT.calculateDiscountChains(expectedMap)
        assertEquals(listOf(ChainOfTwo()), result)
    }

    @Test
    fun seekForChains_return_NoDiscount(){
        expectedMap.put("o", 1)
        val result = SUT.calculateDiscountChains(expectedMap)
        assertEquals(listOf(NoDiscount()), result)
    }

    //----------
    val listOfBooks = listOf(Book("z"), Book("i"), Book("l"),
        Book("t"), Book("o"),
        Book("z"), Book("i"), Book("l"),
        Book("t"), Book("o"),
        Book("z"), Book("i"), Book("l"),
        Book("z"))

    val expectedList = listOf("z","i", "l", "t", "o")

    val expectedDiscountChainList = listOf(ChainOfFive(), ChainOfFive()
                                            ,ChainOfThree(), NoDiscount())
}