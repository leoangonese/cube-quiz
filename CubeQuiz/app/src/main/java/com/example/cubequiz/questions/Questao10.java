package com.example.cubequiz.questions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cubequiz.R;
import com.example.cubequiz.activity.MainActivity;

public class Questao10 extends AppCompatActivity {

    private Button btnA10, btnB10, btnC10, btnD10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao10);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnA10 = findViewById(R.id.btnA10);
        btnB10 = findViewById(R.id.btnB10);
        btnC10= findViewById(R.id.btnC10);
        btnD10 = findViewById(R.id.btnD10);


        btnA10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirPontosFinal();
                MainActivity.acertos++;
            }
        });

        btnB10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirPontosFinal();
            }
        });

        btnC10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirPontosFinal();

            }
        });


        btnD10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirPontosFinal();
            }
        });


    }

    private void abrirPontosFinal() {
        Intent janela = new Intent(this, PontosFinal.class);
        startActivity(janela);
        finish();
    }
}