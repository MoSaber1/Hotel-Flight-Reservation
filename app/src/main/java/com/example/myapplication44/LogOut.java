package com.example.myapplication44;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LogOut extends AppCompatActivity {

    SharedPreferences sh;
    TextView price;
    String data1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_out);


        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel("notify", "My Notification", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }


        price = findViewById(R.id.showcost) ;
        Intent intent=getIntent();
        String num = intent.getStringExtra("NumberOfRooms");
        price.setText(num);


        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder builder = new NotificationCompat.Builder(LogOut.this, "notify");
                builder.setContentTitle("Checkout Complete");
                builder.setContentText("Booking has been Varified");
                builder.setSmallIcon(R.drawable.nimg);
                builder.setAutoCancel(true);
                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(LogOut.this);
                managerCompat.notify(0,builder.build());
            }
        });


       //int numroom=Integer.parseInt(num.toString());

       /* int totalprice=numroom;
        String totall=Integer.toString(totalprice);
        price.setText(totall);*/
       /* TextView t1=findViewById(R.id.showcost);
        sh=getSharedPreferences("myfile",MODE_PRIVATE);
        if(sh.contains("cost")) {
        t1.setText(sh.getString("cost",""));
        }*/


    }
   /* private int getdata(){
        int nightcost=0;
        if(getIntent() .hasExtra("NightPrice")){
            data1 = getIntent().getStringExtra("NightPrice");
             nightcost=Integer.parseInt(data1.toString());
        }

else {
            Toast.makeText(this,"no data", Toast.LENGTH_SHORT).show();
        }
return nightcost;
    }
    private void setdata(){
        price .setText(data1);
    }*/
}