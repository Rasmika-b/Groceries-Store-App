package com.example.grocerystore;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class CustomAdapter1 extends RecyclerView.Adapter<CustomAdapter1.MyHolder> 
{
 Context context;
 String[] subject;
 int[] images;
 public CustomAdapter1(Context c,String[] sub,int[] images){
 this.context = c;
 this.subject = sub;
 this.images = images;
 }
 @NonNull
 @Override
 public CustomAdapter1.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, 
int viewType) {
 View view = 
LayoutInflater.from(parent.getContext()).inflate(R.layout.rows,parent,false);
 MyHolder mh = new MyHolder(view);
 return mh;
 }
 public void onBindViewHolder(CustomAdapter1.MyHolder holder, final int 
position) {
 int resource = images[position];
 String subheading = subject[position];
 holder.setData(resource,subheading);
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
 }
 public void setData(int resource, String subheading) {
 img.setImageResource(resource);
 t1.setText(subheading);
 }
 }
}
