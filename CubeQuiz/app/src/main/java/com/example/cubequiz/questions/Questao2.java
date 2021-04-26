package com.example.cubequiz.questions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cubequiz.R;
import com.example.cubequiz.activity.MainActivity;

public class Questao2 extends AppCompatActivity
{

    private Button btnA2, btnB2, btnC2, btnD2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnA2 = findViewById(R.id.btnA3);
        btnB2 = findViewById(R.id.btnB3);
        btnC2 = findViewById(R.id.btnC3);
        btnD2 = findViewById(R.id.btnD3);

        btnA2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ3();
            }
        });

        btnB2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ3();
            }
        });
        //Questão correta
        btnC2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ3();
                MainActivity.acertos++;
            }
        });

        btnD2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ3();
            }
        });


    }

    private void abrirQ3() {
        Intent janela = new Intent(this, Questao3.class);
        startActivity(janela);
        finish();
    }
}