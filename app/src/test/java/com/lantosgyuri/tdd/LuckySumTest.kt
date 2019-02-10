package com.lantosgyuri.tdd

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class LuckySumTest{

    lateinit var SUT: LuckySum

    @Before
    fun setUp() {
        SUT = LuckySum()
    }

    //every int different
    @Test
    fun calculator_everyIntDifferent_returnSum(){
        val sum = SUT.calculator(1,2,3)
        assertEquals(6, sum)
    }
    //first int is 13
    @Test
    fun calculator_firstIntIs13_returnNull(){
        val sum = SUT.calculator(13,2,3)
        assertEquals(0, sum)
    }
    //second int is 13
    @Test
    fun calculator_secondIntIs13_returnThirdInt(){
        val sum = SUT.calculator(1,13,3)
        assertEquals(3, sum)
    }
    //third int is 13
    @Test
    fun calculator_thirdIntIs13_returnSumOfFirstAndSecondInt(){
        val sum = SUT.calculator(1,3,13)
        assertEquals(4, sum)
    }

}