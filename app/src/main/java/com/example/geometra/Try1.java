package com.example.geometra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Try1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try1);

        TextView txtResultado = (TextView) findViewById(R.id.respcir);
        EditText editRadio = (EditText) findViewById(R.id.Idbasec);
        Button btnRadio = (Button) findViewById(R.id.BotonCalcir);

        btnRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double radio = Double.parseDouble(editRadio.getText().toString());
                double Total = Math.pow(radio, 2) * 3.1416;
                txtResultado.setText("Su Area es: " + Total + " Cm²");
            }
        });

    }

    public void Guardar(View v) {

        Intent G = new Intent(this, area.class);
        startActivity(G);
    }
    //public void grabar(View View ){
        //Intent U = new Intent(Try1.this, area.class);
            //U.putExtra("Area", );
           // startActivity(U);
    //}

}