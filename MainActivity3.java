package com.example.grocerystore;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
public class MainActivity3 extends AppCompatActivity {
 RecyclerView rv;
 int[] images = {R.drawable.tomato,R.drawable.banana,R.drawable.watermelon,R.drawable.capsicum,R.drawable.carrot,R.drawable.potato,R.drawable.apple,R.drawable.orange,R.drawable.onion,R.drawable.grapes};
 String[] price = {"Rs.14","Rs.21","Rs.37","Rs.11","Rs.79","Rs.25","Rs.159","Rs.145","Rs.35","Rs.23"};
 String[] msg = {"Local Organically Grown (1kg)","Robusta (1kg)","Small (1pc: 1.7-2.5kg)","Green and Fresh (500gms)","Local Orange (1kg)","Local Brown and Fresh(1kg)",
 "Red delicious (4pcs: 530-640gms)","Imported and good quality(6pcs)","Local and Fresh(1kg)","Bangalore blue with seed(500gms)"};
 String[] subject = {"Tomato","Banana","Watermelon","Capsicum","Carrot","Potato","Apple","Orange","Onion","Grapes"};
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 rv = (RecyclerView)findViewById(R.id.recycleview);
 LinearLayoutManager ll = new LinearLayoutManager(this);
 ll.setOrientation(RecyclerView.VERTICAL); rv.setLayoutManager(ll);
 CustomAdapter ca = new 
CustomAdapter(MainActivity3.this,subject,price,msg,images);
 rv.setAdapter(ca);
 }
}
