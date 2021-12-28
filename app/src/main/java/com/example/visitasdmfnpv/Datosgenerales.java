package com.example.visitasdmfnpv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Datosgenerales extends AppCompatActivity {
    public static String user="names";
    TextView txtuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datosgenerales);
        txtuser=(TextView) findViewById(R.id.form);

    }}
