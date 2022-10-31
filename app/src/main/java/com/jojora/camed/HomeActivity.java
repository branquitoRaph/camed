package com.jojora.camed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    private ImageView imagelista1;
    private ImageView imagelista2;
    private ImageView imagelista3;
    private ImageView imagelista4;
    private ImageView imagelista5;
    private ImageView imagelista6;
    private ImageView imagelista7;
    private ImageView imagelista8;
    private ImageView imagelista9;
    private ImageView imagelista10;
    private Button botaoHomeIrContato;
    private Button botaoHomeIrSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView imagelista1 = findViewById(R.id.imageViewSintoma1);
        ImageView imagelista2 = findViewById(R.id.imageViewSintoma2);
        ImageView imagelista3 = findViewById(R.id.imageViewSintoma3);
        ImageView imagelista4 = findViewById(R.id.imageViewSintoma4);
        ImageView imagelista5 = findViewById(R.id.imageViewSintoma5);
        ImageView imagelista6 = findViewById(R.id.imageViewSintoma6);
        ImageView imagelista7 = findViewById(R.id.imageViewSintoma7);
        ImageView imagelista8 = findViewById(R.id.imageViewSintoma8);
        ImageView imagelista9 = findViewById(R.id.imageViewSintoma9);
        ImageView imagelista10 = findViewById(R.id.imageViewSintomaAzia);
        Button botaoHomeIrContato = findViewById(R.id.buttonHomeIrContato);
        Button botaoHomeIrSobre = findViewById(R.id.buttonHomeIrSobre);

        Toolbar toolbar = findViewById(R.id.toolbarHome);
        setSupportActionBar(toolbar);

        imagelista1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, MedicamentosActivity.class);
                startActivity(intent);
            }
        });

        imagelista2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, MedicamentosActivity.class);
                startActivity(intent);
            }
        });

        imagelista3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, MedicamentosActivity.class);
                startActivity(intent);
            }
        });

        imagelista4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, MedicamentosActivity.class);
                startActivity(intent);
            }
        });

        imagelista5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, MedicamentosActivity.class);
                startActivity(intent);
            }
        });

        imagelista6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, MedicamentosActivity.class);
                startActivity(intent);
            }
        });
        imagelista7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, MedicamentosActivity.class);
                startActivity(intent);
            }
        });

        imagelista8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, MedicamentosActivity.class);
                startActivity(intent);
            }
        });

        imagelista9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, MedicamentosActivity.class);
                startActivity(intent);
            }
        });

        imagelista10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, MedicamentosActivity.class);
                startActivity(intent);
            }
        });

        botaoHomeIrContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, ContatoActivity.class);
                startActivity(intent);
            }
        });

        botaoHomeIrSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, SobreActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_activity_tb, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.opPerfil:
                Intent intent = new Intent(HomeActivity.this, PerfilActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}