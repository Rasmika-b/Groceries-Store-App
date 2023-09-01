package com.example.grocerystore;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyHolder> {
 Context context;
 String[] subject;
 String[] msg;
 String[] price;
 int[] images;
 public CustomAdapter(Context c,String[] sub,String[] price,String[] msg,int[] 
images){
 this.context = c;
 this.subject = sub;
 this.price = price;
 this.msg = msg;
 this.images = images;
 }
 @NonNull
 @Override
 public CustomAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, 
int viewType) {
 View view = 
LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
 MyHolder mh = new MyHolder(view);
 return mh;
 }
 public void onBindViewHolder(CustomAdapter.MyHolder holder, final int 
position) {
 int resource = images[position];
 String subheading = subject[position];
 String pricerec = price[position];
 String message = msg[position];
 holder.setData(resource,subheading,pricerec,message);
 }
 @Override
 public int getItemCount() {
 return subject.length;
 }
 public class MyHolder extends RecyclerView.ViewHolder {
 ImageView img;
 TextView t1,t2,t3;
 public MyHolder(View item) {
 super(item);
 img = (ImageView)item.findViewById(R.id.imageview);
 t1 = (TextView) item.findViewById(R.id.textview);
 t2 = (TextView) item.findViewById(R.id.textview2);
 t3 = (TextView)item.findViewById(R.id.textview3);
 }
 public void setData(int resource,String subheading,String pricerec,String 
message) {
 img.setImageResource(resource);
 t1.setText(subheading);
 t2.setText(pricerec);
 t3.setText(message);
 }
 }
}
