package com.example.visitasdmfnpv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class programaspacientes extends AppCompatActivity {
    CheckBox c1, c2, c3, c4, c5, c6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programaspacientes);
        c1 = (CheckBox) findViewById(R.id.check1);
        c2 = (CheckBox) findViewById(R.id.check2);
        c3 = (CheckBox) findViewById(R.id.check3);
        c4 = (CheckBox) findViewById(R.id.check4);
        c5 = (CheckBox) findViewById(R.id.check5);
        c6 = (CheckBox) findViewById(R.id.check6);
    }
    public void onclick(View view) {
        if (view.getId() == R.id.btnvalidar){ ;
        validarencuesta();
    }

}
//validacion de chekbox
private void validarencuesta() {
    String cad="Seleccionado: \n";
    if(c1.isChecked()) {
        cad+="Selecciono  pregunta 1\n";

    }
    if (c2.isChecked()) {
        cad+="Selecciono  pregunta 2\n";
    }
    if(c3.isChecked()) {
        cad+="Selecciono  pregunta 3\n";
    }
    if(c4.isChecked()) {
        cad+="Selecciono  pregunta 4\n";
    }
    if(c5.isChecked()) {
        cad+="Selecciono  pregunta 5\n";
    }
    if(c6.isChecked()) {
        cad+="Selecciono  pregunta 6\n";
    }
    Toast.makeText(getApplicationContext(),cad, Toast.LENGTH_SHORT).show();
}

    public void regresarlogin(View view) {
        Intent pasar=new Intent(programaspacientes.this, MainActivity.class);
        startActivity(pasar);
    }
}