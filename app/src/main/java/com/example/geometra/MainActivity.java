package com.example.geometra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Circulo(View v){

        Intent C = new Intent(this, Try1.class);
        startActivity(C);
    }


    public void Triangulo(View v){

        Intent T = new Intent(this, Try2.class);
        startActivity(T);
    }

    public void Rectangulo(View v){

        Intent R = new Intent(this, Try3.class);
        startActivity(R);
    }






}

