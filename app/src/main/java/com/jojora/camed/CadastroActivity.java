package com.jojora.camed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadastroActivity extends AppCompatActivity {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        botao = findViewById(R.id.buttonAvancarCadastro);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CadastroActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

}