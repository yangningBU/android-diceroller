package com.example.diceroller

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    private val die = Die()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enableClickBehavior()
        rollDie()
    }

    private fun enableClickBehavior() {
        val rollButton: Button = findViewById(R.id.rollButton)

        rollButton.setOnClickListener { rollDie() }
    }

    private fun rollDie() {
        die.roll()
        updateImage(R.id.die,  die.currentValue)
    }

    private fun updateImage(viewId: Int, roll: Int) {
        val imageView: ImageView = findViewById(viewId)
        val imageName = "dice_${roll}"
        val imageId = resources.getIdentifier(imageName, "drawable", packageName)

        if (imageId > 0) {
            imageView.setImageResource(imageId)
            imageView.contentDescription = "A die showing the number $roll"
        } else {
            Log.e(TAG, "ERROR: COULD NOT GET DICE IMAGE FOR $roll")
        }
    }
}