package com.example.geometra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Try2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try2);

        TextView txtResultadoTri = (TextView) findViewById(R.id.idres1);
        EditText editAlt = (EditText) findViewById(R.id.Idaltura);
        EditText editBas = (EditText) findViewById(R.id.IdBase);
        Button btntri = (Button) findViewById(R.id.BotonTri);

        btntri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double altura = Double.parseDouble(editAlt.getText().toString());
                Double base = Double.parseDouble(editBas.getText().toString());
                double Total = (altura * base)/2;
                txtResultadoTri.setText("Su Area es: "+Total+"  Cm²");
            }
        });
    }
}