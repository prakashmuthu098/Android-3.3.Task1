package com.example.numberguessgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private val randomNum= Random.nextInt(from = 1, until = 1000)
   //val myRandom: Random? = Random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val guessTextInputView=findViewById<TextInputLayout>(R.id.guess)
        val clickMeButton=findViewById<TextView>(R.id.checkButton)
        val resultDisplayView=findViewById<TextView>(R.id.res)
        clickMeButton.setOnClickListener{
            val num=guessTextInputView.editText?.text?.toString()
            var guessNum:Int= Integer.parseInt(num)
            when
            {
                randomNum>guessNum ->resultDisplayView.text="N0 :) My number is bigger "
                randomNum<guessNum ->resultDisplayView.text="No :) My number is smaller "
                else -> resultDisplayView.text="You are right!"
            }
            }
       }
   }
