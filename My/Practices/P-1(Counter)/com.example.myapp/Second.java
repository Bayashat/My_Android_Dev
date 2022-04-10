package com.example.myapp;


public class Second extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView)findViewById(R.id.text);
        textView.setText(String.valueOf(this.getIntent().getIntExtra("counter", 0)).toString());

        Log.e("Counter", String.valueOf(this.getIntent().getIntExtra("counter", 0)));
    }
}
