package com.example.comofood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Connexion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);
        Button btn=findViewById(R.id.btn);
        Button btn1=findViewById(R.id.btn1);
        EditText login=findViewById(R.id.login);
        EditText passw=findViewById(R.id.mdp);
        View.OnClickListener retour= new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ret=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ret);
            }
        };
        btn.setOnClickListener(retour);
        //View.OnClickListener recup= new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
                //Intent recover=new Intent(getApplicationContext(),  recup.class);
               // startActivity(recover);
       // };
       // btn1.setOnClickListener(recup);
        View.OnClickListener ocl3 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if((et1.getText().toString().length()>0) && (et2.getText().toS"tring().equals("SLAM"))) {
                if((login.getText().toString()=="ASMAR") && (passw.getText().toString()=="SLAM")) {
                    Intent app1 = new Intent(getApplicationContext(), recup.class);
                    Toast.makeText(getApplicationContext(), "réussit avec succès",Toast.LENGTH_LONG).show();
                    app1.putExtra("login",login.getText().toString());
                    startActivity(app1);
                }
                else
                    Toast.makeText(getApplicationContext(), "Mot de pass incorect",Toast.LENGTH_LONG).show();
            }
        };
        btn1.setOnClickListener(ocl3);
    }

}