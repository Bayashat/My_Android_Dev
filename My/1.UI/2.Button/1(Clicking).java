package com.example.myapplicationjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private static final String TAG = "Bayashat";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);

        // 点击事件:
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                btn.setText("Hello Peter");
                Log.e(TAG, "onClick: ");
            }
        });
        // 长按事件
        btn.setOnLongClickListener(new View.OnLongClickListener()
        {
            @Override
            public boolean onLongClick(View view)
            {
                Log.e(TAG, "onLongClick: ");
                return false;
            }
        });
        // 触摸事件
        btn.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent)
            {
                Log.e(TAG, "onTouch: ");
                return false;
            }
        });
    }
    // 在 xml 文件里给Button 指定 "OnClick" 方法: 
    public void My_Click(View v)
    {
        Button btn = (Button)v;
        btn.setText("Hi Peter");
    }
}