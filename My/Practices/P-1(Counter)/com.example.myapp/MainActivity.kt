package com.example.testing

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.testing.R

class MainActivity : AppCompatActivity() {
    var counter = 0 // 创建整数变量: 数按下的数目
    var textView : TextView? = null // 新文本 : 暂为 null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("MainActivity", "onCreate")
        textView = findViewById<View>(R.id.text_view) as TextView // 通过id引用文本(0)
        if (savedInstanceState != null && !savedInstanceState.isEmpty) // 保存信息第二步: 当重构界面时
        {
            Log.e("MainActivity", "savedInstanceState")
            counter = savedInstanceState.getInt("cnt", 0) // 给counter刚刚存在"cnt"的值
            textView!!.text = counter.toString() // 然后刷新文本
        }
    }

    fun onclick(view: View?) {
        Log.e("MainActivity", "onClick")
        counter += 1
        textView!!.text = counter.toString()
    }

    fun change(view: View?) {
        Log.e("MainActivity", "change")
        val intent = Intent(this, Second::class.java)
        intent.putExtra("counter", counter)
        startActivity(intent)
    }

    override fun onSaveInstanceState(outState: Bundle) // 保存信息第一步是这个:
    {
        Log.e("MainActivity", "onSaveInstanceState")
        super.onSaveInstanceState(outState)
        outState.putInt("cnt", counter) // 在State的"cnt" 存counter的值
    }

    override fun onStart() {
        super.onStart()
        Log.e("MainActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("MainActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("MainActivity", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("MainActivity", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity", "onDestroy")
    }
}