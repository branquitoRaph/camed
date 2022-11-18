package com.jojora.camed;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MudarPerfilActivity extends AppCompatActivity {

    private Button voltarParaPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mudar_perfil);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#6368FF")));

        voltarParaPerfil = findViewById(R.id.buttonMudarPerfilVoltarPerfil);

        voltarParaPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MudarPerfilActivity.this, PerfilActivity.class);
                startActivity(intent);
            }
        });
    }
}