package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var imagechange :ImageView
    private lateinit var result :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        imagechange =  findViewById(R.id.diceimage)
        result = findViewById(R.id.textroll)
        val rollButton:Button = findViewById(R.id.thisisrollid)
        rollButton.text = "Lets Roll"
        rollButton.setOnClickListener{
            //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            RollDice()
        }
        if (android.os.Build.VERSION.SDK_INT > android.os.Build.VERSION_CODES.KITKAT){}//do something more than kitkat
    }

    private fun RollDice() {
        val rand :Int= Random().nextInt(6) + 1
        result.text = rand.toString()
        val imagefile = when (rand){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imagechange.setImageResource(imagefile)

    }

}