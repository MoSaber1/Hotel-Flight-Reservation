package com.example.myapplication44;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogIn extends AppCompatActivity {
    public EditText email , password ;
    public Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        email = findViewById(R.id.idEdtUserName);
        password = findViewById(R.id.idEdtPassword);
        login = findViewById(R.id.idBtnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userEmail = email.getText().toString();
                String userPassword = password.getText().toString();

                Intent intent = new Intent(getApplicationContext(),ChooseActivity.class);



                startActivity(intent);



            }
        });

    }
}
