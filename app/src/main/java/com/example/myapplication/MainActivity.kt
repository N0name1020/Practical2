package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.TextViewOnReceiveContentListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get the Button view from this layout and assign a click
        //listener is it

        val rollButton:Button=findViewById(R.id.rollBtn)
        rollButton.setOnClickListener{rollDice()}
    }

    /**
     * Click linster for the Roll Button
     */
    private fun rollDice(){
        Toast.makeText(this, "Dice is Rolled" ,Toast.LENGTH_SHORT).show()
        val randomInt=(1..6).random()

        val resultText:TextView=findViewById(R.id.txtNumber)
        resultText.text=randomInt.toString()
    }
}