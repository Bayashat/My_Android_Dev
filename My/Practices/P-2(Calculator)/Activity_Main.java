package com.example.myapplication;


import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    double num1 = 0.0;
    double num2 = 0.0;
    double res = 0.0;
    String s1 = "";
    String s2 = "";
    char c = '+';

    public  TextView input() { return (TextView)findViewById(R.id.input); }
    public  TextView output() {return (TextView)findViewById(R.id.output); }
    public  TextView btn0() { return (TextView)findViewById(R.id.btn_0); }
    public  TextView btn1() { return (TextView)findViewById(R.id.btn_1); }
    public  TextView btn2() { return (TextView)findViewById(R.id.btn_2); }
    public  TextView btn3() { return (TextView)findViewById(R.id.btn_3); }
    public  TextView btn4() { return (TextView)findViewById(R.id.btn_4); }
    public  TextView btn5() { return (TextView)findViewById(R.id.btn_5); }
    public  TextView btn6() { return (TextView)findViewById(R.id.btn_6); }
    public  TextView btn7() { return (TextView)findViewById(R.id.btn_7); }
    public  TextView btn8() { return (TextView)findViewById(R.id.btn_8); }
    public  TextView btn9() { return (TextView)findViewById(R.id.btn_9); }
    public  TextView btnDot() { return (TextView)findViewById(R.id.btn_dot); }
    public  TextView btnBack() { return (TextView)findViewById(R.id.btn_back); }
    public  TextView btnDivide() { return (TextView)findViewById(R.id.btn_divide); }
    public  TextView btnMultiply() { return (TextView)findViewById(R.id.btn_multiply); }
    public  TextView btnMinus() { return (TextView)findViewById(R.id.btn_minus); }
    public  TextView btnPlus() { return (TextView)findViewById(R.id.btn_plus); }
    public  TextView btnEqual() { return (TextView)findViewById(R.id.btn_equal); }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        btn0().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("0");
            }
        });
        btn1().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("1");
            }
        });
        btn2().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("2");
            }
        });
        btn3().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("3");
            }
        });
        btn4().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("4");
            }
        });
        btn5().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("5");
            }
        });
        btn6().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("6");
            }
        });
        btn7().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("7");
            }
        });
        btn8().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("8");
            }
        });
        btn9().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("9");
            }
        });
        btnDot().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField(".");
            }
        });
        btnDivide().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String txt = input().getText().toString();
                num1 = new Double(txt);
                c = '/';
                input().setText("");
            }
        });
        btnMultiply().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String txt = input().getText().toString();
                num1 = new Double(txt);
                c = '*';
                input().setText("");
            }
        });
        btnPlus().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String txt = input().getText().toString();
                num1 = new Double(txt);
                c = '+';
                input().setText("");
            }
        });
        btnMinus().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String txt = input().getText().toString();
                num1 = new Double(txt);
                c = '-';
                input().setText("");
            }
        });
        btnEqual().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String txt = input().getText().toString();
                num2 = new Double(txt);
                if(c == '+') { res = num1 + num2;}
                else if(c == '-') { res = num1 - num2;}
                else if(c == '*') { res = num1 * num2;}
                else if(c == '/') { res = num1 / num2;}
                String result = Double.toString(res);
                output().setText(result);
            }
        });
        btnBack().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String txt = input().getText().toString();
                if(!txt.isEmpty())
                {
                    input().setText(txt.substring(0,txt.length()-1));
                    output().setText("");
                    res = 0.0;
                }

            }
        });
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String input = input().getText().toString();
        outState.putString("input", input);
        String output = output().getText().toString();
        outState.putString("output", output);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        input().setText((savedInstanceState.getString("input")).toString());
        output().setText(String.valueOf(savedInstanceState.getString("output")));
    }


    public  void setTextField(String str) {
        input().append(str);
    }
}