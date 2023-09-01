package com.example.grocerystore;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
public class MainActivity2 extends AppCompatActivity {
 RecyclerView rv;
int[] images = 
{R.drawable.f,R.drawable.e,R.drawable.b,R.drawable.s,R.drawable.m,R.drawable.oil,
 R.drawable.ice};
String[] subject = {"Fruits 'n' Vegetables","Egg, Meat 'n' Fish","Beverages",
 "Snacks","Bakery 'n' Milk","Foodgrains 'n' Oil",
 "Ice-creams"};
@Override
protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 rv = (RecyclerView)findViewById(R.id.recycleview);
 LinearLayoutManager ll = new LinearLayoutManager(this);
 ll.setOrientation(RecyclerView.VERTICAL); rv.setLayoutManager(ll);
 CustomAdapter ca = new CustomAdapter(MainActivity.this,subject,images);
 rv.setAdapter(ca);
 rv.setOnItemClickListener(new AdapterView.OnItemClickListener()
 {
 @Override
 public void onItemClick(AdapterView<?> parent, View view, int
 position, long id)
 {
 if (position == 1)
 {
 Intent intent = new Intent(getApplicationContext(),
 MainActivity3.class);
 startActivity(intent);
 }
 }
 });
 }
}
