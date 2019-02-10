package com.lantosgyuri.tdd

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class NoTeenSumTest {

    lateinit var SUT: NoTeenSum

    @Before
    fun setUp() {
        SUT = NoTeenSum()
    }

    //int is in the range of 13..19
    @Test
    fun fixTeen_13_return0() {
        val result = SUT.fixTeen(13)
        assertEquals(0, result)
    }

    @Test
    fun fixTeen_14_return0() {
        val result = SUT.fixTeen(14)
        assertEquals(0, result)
    }

    @Test
    fun fixTeen_17_return0() {
        val result = SUT.fixTeen(17)
        assertEquals(0, result)
    }

    @Test
    fun fixTeen_18_return0() {
        val result = SUT.fixTeen(18)
        assertEquals(0, result)
    }

    @Test
    fun fixTeen_19_return0() {
        val result = SUT.fixTeen(19)
        assertEquals(0, result)
    }

    //int is 15
    @Test
    fun fixTeen_15_return15() {
        val result = SUT.fixTeen(15)
        assertEquals(15, result)
    }

    //int is 16
    @Test
    fun fixTeen_16_return16() {
        val result = SUT.fixTeen(16)
        assertEquals(16, result)
    }

    // int is 20
    @Test
    fun fixTeen_20_return20() {
        val result = SUT.fixTeen(20)
        assertEquals(20, result)
    }

}