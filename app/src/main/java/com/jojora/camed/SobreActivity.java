package com.jojora.camed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SobreActivity extends AppCompatActivity {

    private ImageButton botaoimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        botaoimage = findViewById(R.id.imageButtonMedicamentosIrPerfil);
        botaoimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SobreActivity.this, PerfilActivity.class);
                startActivity(intent);
            }
        });
    }
}