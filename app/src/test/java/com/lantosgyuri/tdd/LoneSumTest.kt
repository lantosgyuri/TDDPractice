package com.lantosgyuri.tdd

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class LoneSumTest{

    lateinit var SUT: LoneSum

    @Before
    fun setUp() {
        SUT = LoneSum()
    }

    // every int different
    @Test
    fun calculator_everyIntDifferent_returnSum(){
        val sum = SUT.calculator(1,2,3)
        assertEquals(6, sum)
    }
    // every int the same
    @Test
    fun calculator_everyIntTheSame_returnNUll(){
        val sum = SUT.calculator(1,1,1)
        assertEquals(0,sum)
    }

    //first int different
    @Test
    fun calculator_firstIntDifferent_returnFirstINT(){
        val sum = SUT.calculator(1,2,2)
        assertEquals(1,sum)
    }
    //second int different
    @Test
    fun calculator_secondIntDifferent_returnSecondINT(){
        val sum = SUT.calculator(1,2,1)
        assertEquals(2,sum)
    }
    //third int different
    @Test
    fun calculator_thirdIntDifferent_returnThirdINT(){
        val sum = SUT.calculator(1,1,3)
        assertEquals(3,sum)
    }

}