package com.lantosgyuri.tdd.harrypotter.data

sealed class DiscountChain {
    class NoDiscount : DiscountChain()
    class ChainOfTwo : DiscountChain()
    class ChainOfThree: DiscountChain()
    class ChainOfFour : DiscountChain()
    class ChainOfFive : DiscountChain()
}