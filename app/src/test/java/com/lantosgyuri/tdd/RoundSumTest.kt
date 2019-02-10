package com.lantosgyuri.tdd

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class RoundSumTest{

    lateinit var SUT: RoundSum

    @Before
    fun setUp() {
        SUT = RoundSum()
    }

    //int is 5
    @Test
    fun round10_5_return10(){
        val result = SUT.round10(5)
        assertEquals(10, result)
    }
    //int is 4
    @Test
    fun round10_4_return0(){
        val result = SUT.round10(4)
        assertEquals(0, result)
    }
    // int is 14
    @Test
    fun round10_14_return10(){
        val result = SUT.round10(14)
        assertEquals(10, result)
    }
    // int is 15
    @Test
    fun round10_15_return20(){
        val result = SUT.round10(20)
        assertEquals(20, result)
    }
    // int is 24
    @Test
    fun round10_24_return20(){
        val result = SUT.round10(24)
        assertEquals(20, result)
    }
    // int is 25
    @Test
    fun round10_25_return30(){
        val result = SUT.round10(30)
        assertEquals(30, result)
    }

    // int is 114
    @Test
    fun round10_114_return110(){
        val result = SUT.round10(114)
        assertEquals(110, result)
    }
    //int is 118
    @Test
    fun round10_115_return120(){
        val result = SUT.round10(115)
        assertEquals(120, result)
    }
}