public package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    public final TextView input() {
        return (TextView)findViewById(R.id.input);
    }
    public final TextView output() {
        return (TextView)findViewById(R.id.output);
    }
    public final TextView btn_0() {
        return (TextView)findViewById(R.id.btn_0);
    }
    public final TextView btn_1() {
        return (TextView)findViewById(R.id.btn_1);
    }
    public final TextView btn_2() {
        return (TextView)findViewById(R.id.btn_2);
    }
    public final TextView btn_3() {
        return (TextView)findViewById(R.id.btn_3);
    }
    public final TextView btn_4() {
        return (TextView)findViewById(R.id.btn_4);
    }
    public final TextView btn_5() {
        return (TextView)findViewById(R.id.btn_5);
    }
    public final TextView btn_6() {
        return (TextView)findViewById(R.id.btn_6);
    }
    public final TextView btn_7() {
        return (TextView)findViewById(R.id.btn_7);
    }
    public final TextView btn_8() {
        return (TextView)findViewById(R.id.btn_8);
    }
    public final TextView btn_9() {
        return (TextView)findViewById(R.id.btn_9);
    }
    public final TextView btn_AC() {
        return (TextView)findViewById(R.id.btn_AC);
    }
    public final TextView btn_com() {
        return (TextView)findViewById(R.id.btn_com);
    }
    public final TextView btn_div() {
        return (TextView)findViewById(R.id.btn_div);
    }
    public final TextView btn_eq() {
        return (TextView)findViewById(R.id.btn_eq);
    }
    public final TextView btn_min() {
        return (TextView)findViewById(R.id.btn_min);
    }
    public final TextView btn_mult() {
        return (TextView)findViewById(R.id.btn_mult);
    }
    public final TextView btn_plus() {
        return (TextView)findViewById(R.id.btn_plus);
    }

    public Double num1 = 0.0;
    public Double num2 = 0.0;
    public Double res = 0.0;
    public char c = '+';
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0().setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                setTextField("0");
            }
        });
        btn_1().setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                setTextField("1");
            }
        });
        btn_2().setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                setTextField("2");
            }
        });
        btn_3().setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                setTextField("3");
            }
        });
        btn_4().setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                setTextField("4");
            }
        });
        btn_5().setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                setTextField("5");
            }
        });
        btn_6().setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                setTextField("6");
            }
        });
        btn_7().setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                setTextField("7");
            }
        });
        btn_8().setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                setTextField("8");
            }
        });
        btn_9().setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                setTextField("9");
            }
        });
        btn_com().setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                setTextField(".");
            }
        });
        btn_AC().setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                String str = input().getText().toString();
                if(!str.isEmpty()){ input().setText(str.substring(0,str.length()-1)); }
                output().setText("");
            }
        });

        btn_div().setOnClickListener((new View.OnClickListener() {
            public void onClick(View v) {
                num1 = new Double(input().getText().toString());
                c = '/';
                input().setText("");
            }
        }));


        btn_mult().setOnClickListener((new View.OnClickListener() {
            public void onClick(View v) {
                num1 = new Double(input().getText().toString());
                c = '*';
                input().setText("");
            }
        }));
        btn_min().setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                num1 = new Double(input().getText().toString());
                c = '-';
                input().setText("");
            }
        });
        btn_plus().setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                num1 = new Double(input().getText().toString());
                c = '+';
                input().setText("");
            }
        });
        btn_eq().setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                num2 = new Double(input().getText().toString());
                if(c == '+'){ res = num1 + num2;}
                else if(c == '-'){ res = num1 - num2;}
                else if(c == '*'){ res = num1 * num2;}
                else if(c == '/'){ res = num1 / num2;}

                output().setText(res.toString());
            }
        });
    }

    public void setTextField(String str)
    {
        input().append(str);
    }

}class MainActivity {
    
}
