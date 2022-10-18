package com.jojora.camed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MedicamentosActivity extends AppCompatActivity {

    private ImageButton botaoimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicamentos);

        botaoimage = findViewById(R.id.imageButtonMedicamentosIrPerfil);
        botaoimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MedicamentosActivity.this, PerfilActivity.class);
                startActivity(intent);
            }
        });
    }
}