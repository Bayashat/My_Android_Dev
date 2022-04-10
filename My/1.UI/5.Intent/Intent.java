public class MainActivity
{
    // here are codes
    public void click(View v)
    {
        Intent intent = new Intent(this, second.class);
        EditText editText = (EditText)findViewById(R.id.edittext);
        String message = editText.getText().toString();
        intent.putExtra("Bayashat", message);
        startActivity(intent);

    }
}

public class second
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Here are codes
        Intent intent = getIntent();
        String message = intent.getStringExtra("Bayashat");
        TextView txt = findViewById(R.id.txt);
        txt.setText(message);

    }
}