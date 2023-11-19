package com.varsitycollege.st10297294

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*Variable declarations*/
        var num1 = findViewById<EditText>(R.id.num1)
        var num2 = findViewById<EditText>(R.id.num2)
        val answerView = findViewById<TextView>(R.id.answerView)
        val addButton = findViewById<Button>(R.id.addButton)
        val subtractButton = findViewById<Button>(R.id.subtractButton)
        val multiplyButton = findViewById<Button>(R.id.multipyButton)
        val divButton = findViewById<Button>(R.id.divButton)
        val sqButton = findViewById<Button>(R.id.sqButton)
        val pwButton = findViewById<Button>(R.id.pwButton)
        val statFunc = findViewById<Button>(R.id.statFuncButton)

        /*Add Button code*/
        addButton.setOnClickListener {
            var addNum1 = num1.text.toString().toDouble()
            var addNum2 = num2.text.toString().toDouble()
            var result = addNum1 + addNum2
            answerView.text = "$addNum1 + $addNum2 = $result"
            Toast.makeText(this,"No Errors",Toast.LENGTH_SHORT).show()
        }

        /*subtract Button code*/
        subtractButton.setOnClickListener {
            var addNum1 = num1.text.toString().toDouble()
            var addNum2 = num2.text.toString().toDouble()
            var result = addNum1 - addNum2
            answerView.text = "$addNum1 - $addNum2 = $result"
            Toast.makeText(this,"No Errors",Toast.LENGTH_SHORT).show()
        }

        /*multiply Button code*/
        multiplyButton.setOnClickListener {
            var addNum1 = num1.text.toString().toDouble()
            var addNum2 = num2.text.toString().toDouble()
            var result = addNum1 * addNum2
            answerView.text = "$addNum1 X $addNum2 = $result"
            Toast.makeText(this,"No Errors",Toast.LENGTH_SHORT).show()
        }
        /*Divide Button code*/
        divButton.setOnClickListener {
            var addNum1 = num1.text.toString().toDouble()
            var addNum2 = num2.text.toString().toDouble()
            val result = addNum1 / addNum2
            if (addNum2 == 0.0){
                 answerView.text = "Cannot Divide by 0"
                 Toast.makeText(this,"Error!",Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this,"No Errors",Toast.LENGTH_SHORT).show()
            answerView.text = "$addNum1 ÷ $addNum2 = $result"}

        }
        /*SquareRoot Button code*/
        sqButton.setOnClickListener {
            var addNum1 = num1.text.toString().toDouble()
            var result = sqrt(addNum1).toDouble()
                var sqrChk = sqrt(addNum1*-1).toDouble()
                    if (addNum1 < 0.0){
                answerView.text = "Sqrt($addNum1)= $sqrChk i"
                Toast.makeText(this,"No Errors",Toast.LENGTH_SHORT).show()
            } else answerView.text = "Sqrt($addNum1)=$result"
            Toast.makeText(this,"No Errors",Toast.LENGTH_SHORT).show()
        }
        /*Powers Button code*/
        pwButton.setOnClickListener {
            var addNum1 = num1.text.toString().toInt()
            var addNum2 = num2.text.toString().toInt()
            var pwrStore = num2.text.toString().toInt()
            var result: Long = 1
            while (addNum2 != 0)
            {
                result *= addNum1.toLong()
                --addNum2
            }
            answerView.text = "$addNum1^$pwrStore = $result"
            Toast.makeText(this,"No Errors",Toast.LENGTH_SHORT).show()
        }
        /*StatFuncButton*/


    }
}






