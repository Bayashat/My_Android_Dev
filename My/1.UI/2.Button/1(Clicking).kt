package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) 
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val btn = findViewById<Button>(R.id.btn)

        // 点击事件:
        btn.setOnClickListener{
            btn.text = "Hello Peter"
            Log.e(TAG, "onClick: ")
        }
        // 长按事件
        btn.setOnLongClickListener {
            Log.e(TAG, "onLongClick: ")
            false
        }
        // 触摸事件
        btn.setOnTouchListener { view, motionEvent ->
            Log.e(TAG, "onTouch: ")
            false
        }
    }

    // 在 xml 文件里给Button 指定 "OnClick" 方法: 
    fun My_Click(v: View) {
        val btn = v as Button
        btn.text = "Hi Peter"
    }

    companion object {
        private const val TAG = "Bayashat"
    }
}