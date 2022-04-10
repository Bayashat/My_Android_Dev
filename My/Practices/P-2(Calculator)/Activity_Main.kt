package com.example.myapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception
import android.util.Log


class MainActivity : AppCompatActivity() {

    private fun input() = findViewById<TextView>(R.id.input)
    private fun output() = findViewById<TextView>(R.id.output)
    private fun btn0() = findViewById<TextView>(R.id.btn_0)
    private fun btn1() = findViewById<TextView>(R.id.btn_1)
    private fun btn2() = findViewById<TextView>(R.id.btn_2)
    private fun btn3() = findViewById<TextView>(R.id.btn_3)
    private fun btn4() = findViewById<TextView>(R.id.btn_4)
    private fun btn5() = findViewById<TextView>(R.id.btn_5)
    private fun btn6() = findViewById<TextView>(R.id.btn_6)
    private fun btn7() = findViewById<TextView>(R.id.btn_7)
    private fun btn8() = findViewById<TextView>(R.id.btn_8)
    private fun btn9() = findViewById<TextView>(R.id.btn_9)
    private fun btnDot() = findViewById<TextView>(R.id.btn_dot)
    private fun btnBack() = findViewById<TextView>(R.id.btn_back)
    private fun btnDivide() = findViewById<TextView>(R.id.btn_divide)
    private fun btnMultiply() = findViewById<TextView>(R.id.btn_multiply)
    private fun btnMinus() = findViewById<TextView>(R.id.btn_minus)
    private fun btnPlus() = findViewById<TextView>(R.id.btn_plus)
    private fun btnEqual() = findViewById<TextView>(R.id.btn_equal)

    private var num1 = 0.0
    private var num2 = 0.0
    private var res = 0.0
    private var res2 = 0
    private var s1 = ""
    private var s2 = ""
    private var char = '+'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState);
        outState.putString("input", input().text.toString())
        outState.putString("output", output().text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        input().text = savedInstanceState.getString("input").toString()
        output().text = savedInstanceState.getString("output").toString()
    }

    private fun initUI() {
        btn0().setOnClickListener {
            setTextField("0")
        }
        btn1().setOnClickListener {
            setTextField("1")
        }
        btn2().setOnClickListener {
            setTextField("2")
        }
        btn3().setOnClickListener {
            setTextField("3")
        }
        btn4().setOnClickListener {
            setTextField("4")
        }
        btn5().setOnClickListener {
            setTextField("5")
        }
        btn6().setOnClickListener {
            setTextField("6")
        }
        btn7().setOnClickListener {
            setTextField("7")
        }
        btn8().setOnClickListener {
            setTextField("8")
        }
        btn9().setOnClickListener {
            setTextField("9")
        }
        btnDot().setOnClickListener {
            setTextField(".")
        }

        btnDivide().setOnClickListener {
            num1 = input().text.toString().toDouble()
            char = '/'
            input().text = ""
        }
        btnMultiply().setOnClickListener {
            num1 = input().text.toString().toDouble()
            char = '*'
            input().text = ""
        }
        btnPlus().setOnClickListener {
            num1 = input().text.toString().toDouble()
            char = '+'
            input().text = ""
        }
        btnMinus().setOnClickListener {
            num1 = input().text.toString().toDouble()
            char = '-'
            input().text = ""
        }
        btnEqual().setOnClickListener {
            num2 = input().text.toString().toDouble()
            res = when (char) {
                '+' -> {
                    num1 + num2
                }
                '-' -> {
                    num1 - num2
                }
                '*' -> {
                    num1 * num2
                }
                else -> {
                    num1 / num2
                }
            }

            res2 = res.toInt()
            s1 = res.toString()
            s2 = res2.toString()
            s2 += ".0"
            if(s1 == s2) {
                output().text = res2.toString()
            } else {
                output().text = s1
            }
        }

        btnBack().setOnClickListener {
            val str = input().text.toString()
            if(str.isNotEmpty()) {
                input().text = str.substring(0, str.length - 1)
                output().text = ""
            }
        }
    }

    private fun setTextField(str: String) {
        input().append(str)
    }
}