package com.varsitycollege.st10297294

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*Variable declarations*/
        var num1 = findViewById<EditText>(R.id.num1)
        var num2 = findViewById<EditText>(R.id.num2)
        var result: Int = 0
        val answerView = findViewById<TextView>(R.id.answerView)
        val addButton = findViewById<Button>(R.id.addButton)
        val subtractButton = findViewById<Button>(R.id.subtractButton)
        val multiplyButton = findViewById<Button>(R.id.multipyButton)
        val divButton = findViewById<Button>(R.id.divButton)
        val sqButton = findViewById<Button>(R.id.sqButton)
        val pwButton = findViewById<Button>(R.id.pwButton)

        /*Add Button code*/
        addButton.setOnClickListener {
            var addNum1 = num1.text.toString().toInt()
            var addNum2 = num2.text.toString().toInt()
            var result = addNum1 + addNum2
            answerView.text = "$addNum1 + $addNum2 = $result"
        }

        /*subtract Button code*/
        subtractButton.setOnClickListener {
            var addNum1 = num1.text.toString().toInt()
            var addNum2 = num2.text.toString().toInt()
            var result = addNum1 - addNum2
            answerView.text = "$addNum1 - $addNum2 = $result"
        }

        /*multiply Button code*/
        multiplyButton.setOnClickListener {
            var addNum1 = num1.text.toString().toInt()
            var addNum2 = num2.text.toString().toInt()
            var result = addNum1 * addNum2
            answerView.text = "$addNum1 X $addNum2 = $result"
        }
        /*Divide Button code*/
        divButton.setOnClickListener {
            var addNum1 = num1.text.toString().toInt()
            var addNum2 = num2.text.toString().toInt()
            var result = addNum1 / addNum2
            answerView.text = "$addNum1 ÷ $addNum2 = $result"
        }
    }
}


