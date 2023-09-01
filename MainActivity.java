package com.example.grocerystore;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 EditText a = findViewById(R.id.editTextTextPersonName);
 EditText p = findViewById(R.id.editTextTextPassword);
 Button b = findViewById(R.id.button);
 TextView t = findViewById(R.id.textView6);
 b.setOnClickListener((v -> {
 
if((a.getText().toString().equals("Rasmika"))&&(p.getText().toString().equals
 ("Abc@1234"))){
 t.setText("Login Successful");
 Intent i = new Intent(getApplicationContext(),MainActivity2.class);
 startActivity(i);
}
else{
 t.setText("Login Failed");
 }
 }));
 }
}
