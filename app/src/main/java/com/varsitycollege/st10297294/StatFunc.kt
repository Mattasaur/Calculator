package com.varsitycollege.st10297294

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Window
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StatFunc : AppCompatActivity() {
    lateinit var InputNum: EditText
    lateinit var SumofTotalArray: TextView
    lateinit var SumofTotalNum: TextView
    var arr:ArrayList<Int> = ArrayList(0)

    @SuppressLint("MissingInflatedID")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_stat_func)
        SumofTotalArray
        InputNum
        SumTotalNum
        val
    }
}