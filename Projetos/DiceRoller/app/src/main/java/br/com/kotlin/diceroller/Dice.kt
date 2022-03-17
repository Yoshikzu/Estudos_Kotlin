package br.com.kotlin.diceroller

class Dice(val numSides: Int) {

    fun roll():Int{
        return (1..numSides).random()
    }
}