package com.jojora.camed.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jojora.camed.R;

public class CadastroActivity extends AppCompatActivity {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#6368FF")));

        botao = findViewById(R.id.buttonAvancarCadastro);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Primeiro verificamos se o usuário digitou corretamente os dados de cadastro.
                // No nosso caso, apenas verificamos se o campo não está vazio no momento em que o
                // usuário clicou no botão cadastrar. Se o campo está vazio, exibimos uma mensagem para o
                // usuário indicando que ele não preencheu o campo e retornamos da função sem fazer
                // mais nada.
                EditText etNewEmail =  findViewById(R.id.editTextEmailCadastro);
                final String newEmail = etNewEmail.getText().toString();
                if(newEmail.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo de login não preenchido", Toast.LENGTH_LONG).show();
                    return;
                }

                EditText etNewSenha =  findViewById(R.id.editTextSenhaCadastro);
                final String newSenha = etNewSenha.getText().toString();
                if(newSenha.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo de senha não preenchido", Toast.LENGTH_LONG).show();
                    return;
                }

                EditText etNewSenhaCheck =  findViewById(R.id.editTextSenhaCadastroCheck);
                String newSenhaCheck = etNewSenhaCheck.getText().toString();
                if(newSenhaCheck.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo de checagem de senha não preenchido", Toast.LENGTH_LONG).show();
                    return;
                }

                if(!newSenha.equals(newSenhaCheck)) {
                    Toast.makeText(CadastroActivity.this, "Senha não confere", Toast.LENGTH_LONG).show();
                    return;
                }

                EditText etNewNome =  findViewById(R.id.editTextNomeCadastro);
                final String newNome = etNewNome.getText().toString();
                if(newNome.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo de Nome não está preenchido", Toast.LENGTH_LONG).show();
                    return;
                }

                EditText etNewSobrenome =  findViewById(R.id.editTextSobrenomeCadastro);
                final String newSobrenome = etNewSobrenome.getText().toString();
                if(newSobrenome.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Campo de Sobrenome não está preenchido", Toast.LENGTH_LONG).show();
                    return;
                }

                EditText etNewDataDeNascimento =  findViewById(R.id.editTextDataDeNascimentoCadastro);
                final String newDataDeNascimento = etNewDataDeNascimento.getText().toString();
                if(newDataDeNascimento.isEmpty()) {
                    Toast.makeText(CadastroActivity.this, "Data de nascimento não preenchida", Toast.LENGTH_LONG).show();
                    return;
                }

                Intent intent = new Intent(CadastroActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

}