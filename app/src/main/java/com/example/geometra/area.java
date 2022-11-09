package com.example.geometra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class area extends AppCompatActivity {
        EditText name, fig, diam, ar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        name = (EditText) findViewById(R.id.txtprcir);
        fig = (EditText)  findViewById(R.id.txtfigpr);
        diam = (EditText)  findViewById(R.id.txtbascirp);
        ar = (EditText)  findViewById(R.id.txtArcirp);

    }
    public void Registro (View View){
 BasedeDatos base = new BasedeDatos(this, "save",null,1);

 SQLiteDatabase editBD = base.getWritableDatabase();

        String Nombre = name.getText().toString();
        String Figura = fig.getText().toString();
        double Diametro = Double.parseDouble(diam.getText().toString());
        double Area = Double.parseDouble(ar.getText().toString());



        ContentValues pack = new ContentValues();
        pack.put("name",Nombre);
        pack.put("fig",Figura);
        pack.put("diam",Diametro);
        pack.put("ar",Area);

        editBD.insert("Figuras",null,pack);
        editBD.close();
        Toast.makeText(this,"Su Figura se a guardado", Toast.LENGTH_LONG);
    }


}