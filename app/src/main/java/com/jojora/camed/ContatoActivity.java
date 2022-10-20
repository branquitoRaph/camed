package com.jojora.camed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ContatoActivity extends AppCompatActivity {

    private ImageButton botaoimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        botaoimage = findViewById(R.id.imageButtonContatoIrPerfil);

        botaoimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ContatoActivity.this, PerfilActivity.class);
                startActivity(intent);
            }
        });
    }
}