package com.example.diceroller

import junit.framework.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class DieTest {
    private val die = Die()

    @Test
    fun roll_returns_a_number_between_1_and_6() {
        assertTrue("Roll returns a number between 1 and 6", die.roll() in 1..6)
    }
}