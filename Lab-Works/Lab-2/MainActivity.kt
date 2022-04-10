package com.example.myapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception
import android.util.Log


class MainActivity : AppCompatActivity() {

    fun input() = findViewById<TextView>(R.id.input)
    fun output() = findViewById<TextView>(R.id.output)
    fun btn_0() = findViewById<TextView>(R.id.btn_0)
    fun btn_1() = findViewById<TextView>(R.id.btn_1)
    fun btn_2() = findViewById<TextView>(R.id.btn_2)
    fun btn_3() = findViewById<TextView>(R.id.btn_3)
    fun btn_4() = findViewById<TextView>(R.id.btn_4)
    fun btn_5() = findViewById<TextView>(R.id.btn_5)
    fun btn_6() = findViewById<TextView>(R.id.btn_6)
    fun btn_7() = findViewById<TextView>(R.id.btn_7)
    fun btn_8() = findViewById<TextView>(R.id.btn_8)
    fun btn_9() = findViewById<TextView>(R.id.btn_9)
    fun btn_dot() = findViewById<TextView>(R.id.btn_dot)
    fun btn_back() = findViewById<TextView>(R.id.btn_back)
    fun btn_divide() = findViewById<TextView>(R.id.btn_divide)
    fun btn_multiply() = findViewById<TextView>(R.id.btn_multiply)
    fun btn_minus() = findViewById<TextView>(R.id.btn_minus)
    fun btn_plus() = findViewById<TextView>(R.id.btn_plus)
    fun btn_equal() = findViewById<TextView>(R.id.btn_equal)


    var num1 = 0.0
    var num2 = 0.0
    var res = 0.0
    var char = '+'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_0().setOnClickListener {
            setTextField("0")
        }
        btn_1().setOnClickListener {
            setTextField("1")
        }
        btn_2().setOnClickListener {
            setTextField("2")
        }
        btn_3().setOnClickListener {
            setTextField("3")
        }
        btn_4().setOnClickListener {
            setTextField("4")
        }
        btn_5().setOnClickListener {
            setTextField("5")
        }
        btn_6().setOnClickListener {
            setTextField("6")
        }
        btn_7().setOnClickListener {
            setTextField("7")
        }
        btn_8().setOnClickListener {
            setTextField("8")
        }
        btn_9().setOnClickListener {
            setTextField("9")
        }
        btn_dot().setOnClickListener {
            setTextField(".")
        }



        btn_divide().setOnClickListener {
            num1 = input().text.toString().toDouble()
            char = '/'
            input().text = ""
        }
        btn_multiply().setOnClickListener {
            num1 = input().text.toString().toDouble()
            char = '*'
            input().text = ""
        }
        btn_plus().setOnClickListener {
            num1 = input().text.toString().toDouble()
            char = '+'
            input().text = ""
        }
        btn_minus().setOnClickListener {
            num1 = input().text.toString().toDouble()
            char = '-'
            input().text = ""
        }
        btn_equal().setOnClickListener {
            num2 = input().text.toString().toDouble()
            if(char == '+') {
                res = num1 + num2
            }else if(char == '-'){
                res = num1 - num2
            }else if(char == '*'){
                res = num1 * num2
            }else{
                res = num1 / num2
            }

            output().text = res.toString()
        }


        btn_back().setOnClickListener {
            val str = input().text.toString()
            if(str.isNotEmpty()) {
                input().text = str.substring(0, str.length - 1)
                output().text = ""
            }
        }
    }

    fun setTextField(str: String) {
        input().append(str)
    }
}