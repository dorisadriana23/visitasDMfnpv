package com.example.visitasdmfnpv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Examenfisicobasico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examenfisicobasico);
    }

    public void pasarhabitos(View view) {
        Intent pasar=new Intent(Examenfisicobasico.this, programaspacientes.class);
        startActivity(pasar);


    }
}