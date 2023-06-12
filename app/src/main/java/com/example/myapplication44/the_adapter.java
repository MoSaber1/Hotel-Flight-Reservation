package com.example.myapplication44;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class the_adapter extends RecyclerView.Adapter<the_adapter.WordViewHolder>{
    String st1[],st2[],st3[];
    int imagee[],imag;
    Context context;


    public  the_adapter(Context ct ,int image1[], int image2, String[] s1, String[] s2, String[] s3){
        context =ct;
        imagee = image1;
        imag = image2;
        st1 = s1;
        st2 = s2;
        st3 =s3;

    }


    @Override
    public the_adapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater mInflater = LayoutInflater.from(context);
        View view  = mInflater.inflate(R .layout.recyclar_layout,parent,false);
        return new WordViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull the_adapter.WordViewHolder holder, int position) {
        holder .t1 .setText(st1[position]);
        holder .t2 .setText(st2[position]);
        holder .t3 .setText(st3[position]);
        holder .im1.setImageResource(imagee[position]);
        holder .im2.setImageResource(imag);
        holder .layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent end=new Intent(context,LogOut.class);
                end.putExtra("NightPrice",st3[position]);
                context .startActivity(end);
            }
        });


    }

    @Override
    public int getItemCount() {
        return st1.length;
    }
    public class WordViewHolder extends RecyclerView.ViewHolder {
        TextView t1, t2,t3;
        ImageView im1 ,im2;
        Button layout;

        public WordViewHolder (View view){
            super(view);
            t1 = itemView .findViewById(R.id.image11);
            t2 = itemView .findViewById(R.id.text22);
            t3 = itemView .findViewById(R.id.text222);
            im1 = itemView .findViewById(R.id.i1);
            im2 = itemView .findViewById(R.id .star);

            layout = itemView .findViewById(R.id .book);
        }
    }


}
