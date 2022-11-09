package com.example.geometra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Try3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try3);

        TextView txtResultadoRec = (TextView) findViewById(R.id.resrec);
        EditText editAltRec = (EditText) findViewById(R.id.IdCua);
        EditText editBasRec = (EditText) findViewById(R.id.txt13);
        Button btnRec = (Button) findViewById(R.id.button4);

        btnRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double altura = Double.parseDouble(editAltRec.getText().toString());
                Double base = Double.parseDouble(editBasRec.getText().toString());
                double Total = altura * base;
                txtResultadoRec.setText("Su Area es: "+Total+" Cm²");
            }
        });



    }
}