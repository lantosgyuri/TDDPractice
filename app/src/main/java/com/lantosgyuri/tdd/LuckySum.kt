package com.lantosgyuri.tdd


/*
Given 3 int values, a b c, return their sum.
However, if one of the values is 13 then it does not count towards the sum and values to its right do not count.
So for example, if b is 13, then both b and c do not count.

luckySum(1, 2, 3) → 6
luckySum(1, 2, 13) → 3
luckySum(1, 13, 3) → 1
 */
class LuckySum {

    fun calculator(num1: Int, num2:Int, num3: Int)= when {
            num1 == 13 -> 0
            num2 == 13 -> num3
            num3 == 13 -> num1 + num2
            else -> num1 + num2 + num3
    }
}