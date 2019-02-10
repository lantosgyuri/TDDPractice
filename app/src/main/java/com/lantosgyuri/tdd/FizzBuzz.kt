package com.lantosgyuri.tdd

class FizzBuzz {

    fun converter(number: Int) = when{
        number % 15 == 0 -> "FizzBuzz"
        number % 3 == 0 -> "Fizz"
        number % 5 == 0 -> "Buzz"
        else -> number.toString()
    }

    fun print100Numbers() = with(StringBuilder()){
        for (number in 1..15){
            append(converter(number))
            if(number <= 14) append(", ")
        }
        toString()
    }


}