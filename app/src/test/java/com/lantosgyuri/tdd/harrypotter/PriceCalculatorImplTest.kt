package com.lantosgyuri.tdd.harrypotter

import com.lantosgyuri.tdd.harrypotter.data.DiscountChain
import com.lantosgyuri.tdd.harrypotter.data.DiscountChain.*
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class PriceCalculatorImplTest{

    lateinit var SUT: PriceCalculatorImpl

    @Before
    fun setUp() {
        SUT = PriceCalculatorImpl()
    }

    @Test
    fun noDiscount_return_8(){
        val result = SUT.getPrice(listOf(NoDiscount()))
        assertEquals(8.0, result, 0.0)
    }

    @Test
    fun chainOfTwo_return_15_20(){
        val result = SUT.getPrice(listOf(ChainOfTwo()))
        assertEquals(15.20, result, 0.0)
    }

    @Test
    fun chainOfThree_return_21_60(){
        val result = SUT.getPrice(listOf(ChainOfThree()))
        assertEquals(21.60, result, 0.0)
    }

    @Test
    fun chainOfFour_return_25_60(){
        val result = SUT.getPrice(listOf(ChainOfFour()))
        assertEquals(25.60, result, 0.0)
    }

    @Test
    fun chainOfFive_return_30(){
        val result = SUT.getPrice(listOf(ChainOfFive()))
        assertEquals(30.0, result, 0.0)
    }

    @Test
    fun chainOfFive_chainOfFive_return_60(){
        val result = SUT.getPrice(listOf(ChainOfFive(), ChainOfFive()))
        assertEquals(60.0, result, 0.0)
    }

    @Test
    fun chainOfThree_ChainOfFive_return_51_60(){
        val result = SUT.getPrice(listOf(ChainOfFive(), ChainOfThree()))
        assertEquals(51.60, result, 0.0)
    }


}