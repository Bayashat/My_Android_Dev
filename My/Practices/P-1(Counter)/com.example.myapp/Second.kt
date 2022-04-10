package com.example.testing

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.testing.R

class Second : AppCompatActivity()
{
    var textView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        textView = findViewById<View>(R.id.text) as TextView
        textView!!.text = this.intent.getIntExtra("counter", 0).toString()
        Log.e("Counter", this.intent.getIntExtra("counter", 0).toString())
    }
}