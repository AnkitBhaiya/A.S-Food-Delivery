package com.ankitsharma.asfooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button login;
      Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Transparent Action Bar
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS

        );
        getSupportActionBar().hide();
        login = findViewById (R.id.login);
        login.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Toast.makeText (MainActivity.this, "Login has been clicked", Toast.LENGTH_SHORT).show ();
                Intent intent = new Intent (MainActivity.this, LoginActivity.class);
                startActivity (intent);

            }
        });
       register = findViewById (R.id.signup);
       register.setOnClickListener (new View.OnClickListener () {
           @Override
           public void onClick(View v) {
               Toast.makeText (MainActivity.this,"Register has been clicked",Toast.LENGTH_SHORT).show ();
               Intent intent = new Intent (MainActivity.this,SignUp_Activity.class);
               startActivity (intent);
           }
       });


    }
}