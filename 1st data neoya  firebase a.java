//XML

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Enter your message:"
        android:textSize="18sp"
        android:layout_marginBottom="8dp"/>

    <EditText
        android:id="@+id/editText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Type here"
        android:inputType="text"
        android:layout_marginBottom="16dp"/>

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Submit"/>

</LinearLayout>

//




//java ********************

    private TextView textView;
    private EditText editText;
    private Button button;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        databaseReference= FirebaseDatabase.getInstance().getReference().child("Mydata");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editText.getText().toString();
                databaseReference.setValue(data);
                textView.setText(data);
            }
        });
    }
}

//****************************
