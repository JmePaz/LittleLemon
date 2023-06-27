package com.example.littlelemon

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var topLayout:LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //code
        topLayout = findViewById(R.id.topLayout)
        topLayout.setBackgroundColor(Color.parseColor("#314E31"))
        var textView:TextView = TextView(this)
        textView.text = resources.getText(R.string.little_lemon)
        textView.setTextColor(Color.parseColor("#EEEEEE"))
        topLayout.addView(textView)
    }
}