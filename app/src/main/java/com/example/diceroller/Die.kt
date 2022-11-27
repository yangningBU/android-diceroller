package com.example.diceroller

const val DEFAULT_NUMBER_OF_SIDES = 6

class Die(val numberOfSides: Int = DEFAULT_NUMBER_OF_SIDES) {
    var rollCount = 0
    var currentValue = 1

    fun roll(): Int {
        rollCount++
        currentValue = (1..numberOfSides).random()

        return currentValue
    }
}