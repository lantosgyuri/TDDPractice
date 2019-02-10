package com.lantosgyuri.tdd
/*

Given 3 int values, a b c, return their sum.
However, if one of the values is the same as another of the values,
it does not count towards the sum.

loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0
 */
class LoneSum {

    fun calculator(number1: Int, number2: Int, number3: Int): Int {
        val numb1EqualsNum2 = number1 == number2
        val numb2EqualsNum3 = number2 == number3
        val numb1EqualsNum3 = number1 == number3
        return when{
                numb1EqualsNum2 && numb2EqualsNum3  && numb1EqualsNum3-> 0
                numb2EqualsNum3 -> number1
                numb1EqualsNum3 -> number2
                numb1EqualsNum2 -> number3
                else -> number1 + number2 + number3
            }
    }

}