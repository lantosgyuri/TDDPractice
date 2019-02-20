package com.lantosgyuri.tdd.tenniskata

class Player(var name: String, var points: Int = 0)  {

    fun playerScored(){
        points++
    }

}