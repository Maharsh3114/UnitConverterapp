{
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editTextTextPersonName);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//  Toast.makeText(MainActivity.this, "Hi click listener worked!", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                double kg = Double.parseDouble(s);
//                double pound = 2.205 * kg;
//                textView.setText("The corresponding value in Pounds is "+String.format("%2f",pound));
//
    }
 public void calculate(View view){
//                Toast.makeText(MainActivity.this, "Hi click listener worked!", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                double kg = Double.parseDouble(s);
                double pound = 2.205 * kg;
                textView.setText("The corresponding value in Pounds is "+String.format("%2f",pound));
//
            }
        }
