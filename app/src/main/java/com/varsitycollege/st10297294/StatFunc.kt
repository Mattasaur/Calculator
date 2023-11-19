package com.varsitycollege.st10297294

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class StatFunc : AppCompatActivity() {
    lateinit var InputNum: EditText
    lateinit var SumofTotalArray: TextView
    lateinit var SumofTotalNum: TextView
    var arr: ArrayList<Int> = ArrayList(0)

    @SuppressLint("MissingInflatedID")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_stat_func)
        SumofTotalArray = findViewById(R.id.numArrayDisplay)
        InputNum = findViewById(R.id.inputNumber)
        SumofTotalNum = findViewById(R.id.answerDisplay)
        val clearwithbtn = findViewById<Button>(R.id.clrArrayBtn)
        val buttonAvg = findViewById<Button>(R.id.avgBtn)
        val buttonMinMax = findViewById<Button>(R.id.minMaxBtn)
        val returnHome = findViewById<Button>(R.id.returnBtn)
        val addNums = findViewById<Button>(R.id.inputNumAdd)

        addNums.setOnClickListener {
            val numone = InputNum.text.toString()

            if (numone.isBlank()) {
                Toast.makeText(this, "please enter a number", Toast.LENGTH_SHORT).show()
                Log.e("error", "No input entered")
            } else if (arr.size != 10) {
                ADD(numone.toInt())
                InputNum.text.clear()
            } else if (arr.size == 10) {
                Toast.makeText(this, "Reached Max Number", Toast.LENGTH_SHORT).show()
            }
        }
        returnHome.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        clearwithbtn.setOnClickListener {
            val num1 = InputNum.text.toString()
            if (arr.size == 0) {
                Toast.makeText(this, "Please fill in Array", Toast.LENGTH_SHORT).show()
            } else {
                arr.clear()
                InputNum.text.clear()
                SumofTotalArray.text = ""
            }
        }

        buttonAvg.setOnClickListener {
            if (arr.size == 0) {
                Toast.makeText(this, "array has no numbers", Toast.LENGTH_SHORT).show()
            } else {
                Average()
            }
        }
        buttonMinMax.setOnClickListener {
            if (arr.size == 0) {
                Toast.makeText(this, "array has no numbers", Toast.LENGTH_SHORT).show()
            } else {
                var minimum = Int.MAX_VALUE
                var maximum = 0
                var subtotal = 0
                for (i in arr) {
                    subtotal += i
                    if (i < minimum) minimum = i
                    if (i > maximum) maximum = i
                }
                SumofTotalNum.text = "Min=${minimum} Max=${maximum}"
                InputNum.text.clear()
            }

        }
    }

    private fun Average() {
        var sumT = 0
        val Arraysize = arr.size
        for (Element in arr) {
            sumT += Element
            val result = sumT
            val average = result / arr.size
            SumofTotalNum.text = "Average=${arr.joinToString(separator = "+")}=${arr.sum()}/$Arraysize=$average"
        }
    }

    private fun ADD(numone: Int) {
        arr.add(numone)
        val sBuild=StringBuilder()
        for (x in arr){
            SumofTotalArray.text="${sBuild.append(x).append(",  ")}"

        }
    }



}
