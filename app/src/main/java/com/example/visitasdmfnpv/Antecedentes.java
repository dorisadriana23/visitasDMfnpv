package com.example.visitasdmfnpv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Antecedentes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antecedentes);
    }

    public void pasarexamenbasico(View view) {
        Intent pasar=new Intent(Antecedentes .this, Examenfisicobasico.class);
        startActivity(pasar);
    }
}