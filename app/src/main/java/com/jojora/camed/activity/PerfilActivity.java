package com.jojora.camed.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jojora.camed.R;

public class PerfilActivity extends AppCompatActivity {

    private Button botao;
    private Button cadastroEndereco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#6368FF")));

        botao = findViewById(R.id.buttonMudarPerfil);
        cadastroEndereco = findViewById(R.id.buttonIrCadastrarEndereco);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(PerfilActivity.this, MudarPerfilActivity.class);
                startActivity(intent);
            }
        });

        cadastroEndereco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(PerfilActivity.this, CadastroDeEnderecoActivity.class);
                startActivity(intent);
            }
        });
    }
}