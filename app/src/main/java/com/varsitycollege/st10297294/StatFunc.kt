package com.varsitycollege.st10297294

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StatFunc : AppCompatActivity() {
    private lateinit var text1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stat_func)
        var text1 = findViewById<TextView>(R.id.text1)
    }
}