package com.lantosgyuri.tdd

/*
Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
Return 0 if they both go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
 */

class BlackJack {

    fun calculator(num1: Int, num2: Int) = when {
            num1 > 21 -> num2
            num2 > 21 -> num1
            else -> Math.max(num1, num2)
    }
}