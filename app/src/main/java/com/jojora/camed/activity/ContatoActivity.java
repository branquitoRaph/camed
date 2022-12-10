package com.jojora.camed.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.jojora.camed.R;
import com.jojora.camed.model.CadastroViewModel;
import com.jojora.camed.model.ContatoViewModel;

public class ContatoActivity extends AppCompatActivity {

    private Button botaoMandarContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#6368FF")));

        ContatoViewModel vm = new ViewModelProvider(this).get(ContatoViewModel.class);

        botaoMandarContato = findViewById(R.id.buttonEnviarContato);

        botaoMandarContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Primeiro verificamos se o usuário digitou corretamente os dados de cadastro.
                // No nosso caso, apenas verificamos se o campo não está vazio no momento em que o
                // usuário clicou no botão cadastrar. Se o campo está vazio, exibimos uma mensagem para o
                // usuário indicando que ele não preencheu o campo e retornamos da função sem fazer
                // mais nada.
                EditText etNewDescriMensagem =  findViewById(R.id.editTextMensagemContato);
                final String newDescriMensagem = etNewDescriMensagem.getText().toString();
                if(newDescriMensagem.isEmpty()) {
                    Toast.makeText(ContatoActivity.this, "Campo de mensagem não preenchido", Toast.LENGTH_LONG).show();
                    return;
                }

                EditText etNewDescriCategoria =  findViewById(R.id.editTextContatoCategoria);
                final String newDescriCategoria = etNewDescriCategoria.getText().toString();
                if(newDescriCategoria.isEmpty()) {
                    Toast.makeText(ContatoActivity.this, "Campo de topico não preenchido", Toast.LENGTH_LONG).show();
                    return;
                }

                EditText etNewEmailContato =  findViewById(R.id.editTextTextContatoEmail);
                final String newEmailContato = etNewEmailContato.getText().toString();
                if(newEmailContato.isEmpty()) {
                    Toast.makeText(ContatoActivity.this, "Campo de email não preenchido", Toast.LENGTH_LONG).show();
                    return;
                }

                LiveData<Boolean> resultadoLD = vm.contato(newDescriCategoria, newEmailContato, newDescriMensagem);

                resultadoLD.observe(ContatoActivity.this, new Observer<Boolean>() {
                    @Override
                    public void onChanged(Boolean aBoolean) {
                        if(aBoolean) {
                            Toast.makeText(ContatoActivity.this, "Mensagem enviada com sucesso", Toast.LENGTH_LONG).show();
                            finish();
                        }
                        else {
                            // Se o cadastro não deu certo, apenas continuamos na tela de cadastro e
                            // indicamos com uma mensagem ao usuário que o cadastro não deu certo.
                            Toast.makeText(ContatoActivity.this, "Erro ao enviar mensagem", Toast.LENGTH_LONG).show();
                        }
                    }
                });

                Intent intent = new Intent(ContatoActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

}