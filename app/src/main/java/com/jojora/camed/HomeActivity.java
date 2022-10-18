package com.jojora.camed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    private ImageButton botaoimage;
    private ImageButton botaoimagelista1;
    private ImageButton botaoimagelista2;
    private ImageButton botaoimagelista3;
    private ImageButton botaoimagelista4;
    private ImageButton botaoimagelista5;
    private ImageButton botaoimagelista6;
    private Button botaocontato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        botaoimage = findViewById(R.id.imageButtonHomeIrPerfil);
        botaoimagelista1 = findViewById(R.id.imageButtonHomeSintoma1);
        botaoimagelista2 = findViewById(R.id.imageButtonHomeSintoma2);
        botaoimagelista3 = findViewById(R.id.imageButtonHomeSintoma3);
        botaoimagelista4 = findViewById(R.id.imageButtonHomeSintoma4);
        botaoimagelista5 = findViewById(R.id.imageButtonHomeSintoma5);
        botaoimagelista6 = findViewById(R.id.imageButtonHomeSintoma6);
        botaocontato = findViewById(R.id.buttonHomeContato);

        botaoimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, PerfilActivity.class);
                startActivity(intent);
            }
        });

        botaoimagelista1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, MedicamentosActivity.class);
                startActivity(intent);
            }
        });

        botaoimagelista2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, MedicamentosActivity.class);
                startActivity(intent);
            }
        });

        botaoimagelista3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, MedicamentosActivity.class);
                startActivity(intent);
            }
        });

        botaoimagelista4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, MedicamentosActivity.class);
                startActivity(intent);
            }
        });

        botaoimagelista5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, MedicamentosActivity.class);
                startActivity(intent);
            }
        });

        botaoimagelista6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, MedicamentosActivity.class);
                startActivity(intent);
            }
        });

        botaocontato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, ContatoActivity.class);
                startActivity(intent);
            }
        });
    }
}