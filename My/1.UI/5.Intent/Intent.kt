class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // Here are codes
    val editText = findViewById<EditText>(R.id.edittext)
    val message = editText.text.toString()
    val intent = Intent(this, second::class.java).apply {
        putExtra("Bayashat", message)
    }
    startActivity(intent)

}

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    
    // Here are codes
    val message = intent.getStringExtra("Bayashat")
    val txt = findViewById<TextView>(R.id.txt)
    txt.setText(message)

}

