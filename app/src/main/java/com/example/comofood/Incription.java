package com.example.comofood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Incription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incription);
        Button btn=findViewById(R.id.button);
        Button btn1=findViewById(R.id.button1);

        View.OnClickListener retour= new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ret=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ret);
            }
        };
        btn.setOnClickListener(retour);
        View.OnClickListener recup= new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recover=new Intent(getApplicationContext(), Acceuil.class);
                startActivity(recover);
            }

        };
        btn1.setOnClickListener(recup);
}
}