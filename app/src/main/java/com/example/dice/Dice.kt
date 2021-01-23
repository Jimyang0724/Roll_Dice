package com.example.dice

class Dice {
    val sides = 6
    
    fun Roll1(): Int {
        return (1..sides).random()
    }
}