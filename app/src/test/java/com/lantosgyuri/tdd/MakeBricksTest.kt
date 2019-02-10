package com.lantosgyuri.tdd

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MakeBricksTest{

    lateinit var SUT: MakeBricks

    @Before
    fun setUp() {
        SUT = MakeBricks()
    }

    @Test
    fun calculator_twoOneInch_goal2Inch_ReturnTrue(){
        val result = SUT.calculator(2,0,2)
        assertEquals(true, result)
    }

    @Test
    fun calculator_twoOneInch_goal3Inch_ReturnFalse(){
        val result = SUT.calculator(2,0,3)
        assertEquals(false, result)
    }

    @Test
    fun calculator_twoFiveInch_goal10Inch_ReturnTrue(){
        val result = SUT.calculator(0,2,10)
        assertEquals(true, result)
    }

    @Test
    fun calculator_twoFiveInch_goal11Inch_ReturnFalse(){
        val result = SUT.calculator(0,2,11)
        assertEquals(false, result)
    }

    @Test
    fun calculator_twoFiveInch2OneInch_goal12Inch_ReturnTrue(){
        val result = SUT.calculator(2,2,12)
        assertEquals(true, result)
    }

    @Test
    fun calculator_twoFiveInch2OneInch_goal14Inch_ReturnFalse(){
        val result = SUT.calculator(2,2,14)
        assertEquals(false, result)
    }

    @Test
    fun calculator_twoFiveInch2OneInch_goal10Inch_ReturnTrue(){
        val result = SUT.calculator(2,2,10)
        assertEquals(true, result)
    }

    @Test
    fun calculator_twoFiveInch2OneInch_goal11Inch_ReturnTrue(){
        val result = SUT.calculator(2,2,11)
        assertEquals(true, result)
    }

    @Test
    fun calculator_1FiveInch10OnInch_goal10Inch_ReturnTrue(){
        val result = SUT.calculator(10,1,11)
        assertEquals(true, result)
    }

    @Test
    fun calculator_0FiveInch7OnInch_goal4Inch_ReturnTrue(){
        val result = SUT.calculator(7,0,4)
        assertEquals(true, result)
    }

    @Test
    fun calculator_3FiveInch2OnInch_goal0Inch_ReturnTrue(){
        val result = SUT.calculator(2,3,10)
        assertEquals(true, result)
    }

    @Test
    fun calculator_3FiveInch2OnInch_goal1Inch_Returnrue(){
        val result = SUT.calculator(2,3,11)
        assertEquals(true, result)
    }

    @Test
    fun calculator_3FiveInch2OnInch_goal3Inch_ReturnFalse(){
        val result = SUT.calculator(2,3,13)
        assertEquals(false, result)
    }

    @Test
    fun calculator_sumSmallerThenGoal_returnFalse(){
        val result = SUT.calculator(2,2,16)
        assertEquals(false, result)
    }

}