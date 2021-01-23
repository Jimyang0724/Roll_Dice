package com.example.dice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener{
            val result: TextView = findViewById(R.id.textView)
            rollDice()
        }
        

    }

    fun rollDice() {
        val result: TextView = findViewById(R.id.textView)
        val dice = Dice()
        val diceImage: ImageView = findViewById(R.id.imageView)
        val resInt = dice.Roll1()
        when(resInt){
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
            else-> diceImage.setImageResource(R.drawable.dice_1)
        }
        result.text = resInt.toString()
    }
}

