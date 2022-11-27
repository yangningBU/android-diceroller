package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enableClickBehavior()
    }

    private fun enableClickBehavior() {
        val rollButton: Button = findViewById(R.id.rollButton)
        val die = Die()

        rollButton.setOnClickListener { rollDieAndInform(die) }
    }

    private fun rollDieAndInform(die: Die) {
        die.roll()

        updateText(R.id.rollText,  die.currentValue.toString())
        createToast("You've rolled ${die.rollCount} time(s)")
    }

    private fun updateText(viewId: Int, textContent: String) {
        val textView: TextView = findViewById(viewId)
        textView.text = textContent
    }

    private fun createToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}