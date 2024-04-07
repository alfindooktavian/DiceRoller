package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var rollBtn:Button
    private lateinit var diceImg:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImg = findViewById(R.id.dice_img)

        rollBtn = findViewById(R.id.roll_btn)

        rollBtn.setOnClickListener {
            rollDice()
        }

        }

    private fun rollDice() {
        val randomInt:Int = Random.nextInt(6)+1

        val drawableImg = when(randomInt){
            1-> R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        diceImg.setImageResource(drawableImg)
        Toast.makeText(this,"diceRolled!",Toast.LENGTH_SHORT).show()
    }


}