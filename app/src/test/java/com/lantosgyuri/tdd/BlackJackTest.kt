package com.lantosgyuri.tdd

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class BlackJackTest{

    lateinit var SUT: BlackJack
    @Before
    fun setUp() {
        SUT = BlackJack()
    }

    // first int is greater than 21
    @Test
    fun calculator_firstIntIsGreaterThan21_returnSecondInt(){
        val result = SUT.calculator(22, 4)
        assertEquals(4, result)
    }
    //second int is greater than 22
    @Test
    fun calculator_SecondIntIsGreaterThan21_returnFirstInt(){
        val result = SUT.calculator(20, 22)
        assertEquals(20, result)
    }
    // first is nearer than second
    @Test
    fun calculator_firstIntIsNearerThanSecond_returnFirstInt(){
        val result = SUT.calculator(20, 19)
        assertEquals(20, result)
    }
    //second int is nearer than first
    @Test
    fun calculator_secondIntIsNearerThanFirst_returnSecondInt(){
        val result = SUT.calculator(4, 19)
        assertEquals(19, result)
    }

    //first int is 21
    @Test
    fun calculator_firstIntIs21_returnFirstInt(){
        val result = SUT.calculator(21, 19)
        assertEquals(21, result)
    }

    //first int is 21
    @Test
    fun calculator_secondIntIs21_returnSecondInt(){
        val result = SUT.calculator(19, 21)
        assertEquals(21, result)
    }

}