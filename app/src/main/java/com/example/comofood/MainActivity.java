package com.example.comofood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1=findViewById(R.id.Signup);
        Button btn2 = findViewById(R.id.signin);

        View.OnClickListener signup= new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent insc=new Intent(getApplicationContext(), Incription.class);
                startActivity(insc);
            }

        };
        btn1.setOnClickListener(signup);
        View.OnClickListener signin= new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent conn=new Intent(getApplicationContext(), Connexion.class);
                startActivity(conn);
            }

        };
        btn2.setOnClickListener(signin);
    }
}