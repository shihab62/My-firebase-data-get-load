//XML 1111111

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

//****************************1111111111111111111111111111111111111 EEEEEEEEEEEEEENNNNNNNNNNNNNDDDDDDDDDDDDDDD




















// 22222222222222222 *********************  akhane data niye asa  


public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button,button2;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        databaseReference= FirebaseDatabase.getInstance().getReference().child("Mydata");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editText.getText().toString();
                databaseReference.setValue(data);
            }


        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editText.getText().toString();
                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                       if(snapshot.exists()){

                           String showdata=snapshot.toString().toString();
                           textView.setText(showdata);

                       }
                       else {                Toast.makeText(MainActivity.this, "no data: ", Toast.LENGTH_SHORT).show();

                       }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }


        });





    }


// xml 
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




    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="get"/>

</LinearLayout>
// *************************************************************************************************2222222222222 ensd








// akhane amra    data success full  gece ki na seta dekhbo button1  *****************************************

      private TextView textView;
    private EditText editText;
    private Button button,button2;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        databaseReference= FirebaseDatabase.getInstance().getReference().child("messages");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editText.getText().toString();
                databaseReference.setValue(data).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Toast.makeText(MainActivity.this, "Data successfully saved!", Toast.LENGTH_SHORT).show();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(MainActivity.this, "Failed to save data: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editText.getText().toString();
                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                       if(snapshot.exists()){

                           String showdata=snapshot.toString().toString();
                           textView.setText(showdata);

                       }
                       else {                Toast.makeText(MainActivity.this, "no data: ", Toast.LENGTH_SHORT).show();

                       }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }


        });



    }


}


// *************************************************               ******************************


    











