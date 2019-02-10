package com.lantosgyuri.tdd

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class FizzBuzzTest {

    lateinit var SUT: FizzBuzz

    @Before
    fun setup(){
        SUT = FizzBuzz()
    }

    @Test
    fun by3ModPrintFizz_testBy2_printNUmber(){
        assertEquals("2", SUT.converter(2))
    }

    @Test
    fun by3ModPrintFizz_testBy3_printFizz(){
        assertEquals("Fizz", SUT.converter(3))
    }

    @Test
    fun by5ModPrintBuzz_testBy4_printNumber(){
        assertEquals("4", SUT.converter(4))
    }

    @Test
    fun by5ModPrintBuzz_testBy5_printBuzz(){
        assertEquals("Buzz", SUT.converter(5))
    }

    @Test
    fun by15ModPrintBuzz_testBy15_printFizzBuzz(){
        assertEquals("FizzBuzz", SUT.converter(15))
    }

    @Test
    fun by15ModPrintBuzz_testBy16_printNumber(){
        assertEquals("16", SUT.converter(16))
    }

    @Test
    fun test15Number(){
        assertEquals(numbers, SUT.print100Numbers())
    }


    //------------------------------
    val numbers = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz"
}