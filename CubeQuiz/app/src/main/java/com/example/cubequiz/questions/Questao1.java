package com.example.cubequiz.questions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cubequiz.R;
import com.example.cubequiz.activity.MainActivity;

public class Questao1 extends AppCompatActivity
{
    private Button btnA1, btnB1, btnC1, btnD1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Mapeamento
        btnA1 = findViewById(R.id.btnA1);
        btnB1 = findViewById(R.id.btnB1);
        btnC1 = findViewById(R.id.btnC1);
        btnD1 = findViewById(R.id.btnD1);

        btnA1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ2();
            }
        });

        btnB1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ2();
            }
        });
        //Questão correta
        btnC1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ2();
                MainActivity.acertos++;
            }
        });

        btnD1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ2();
            }
        });

    }

    private void abrirQ2() {
        Intent janela = new Intent(this, Questao2.class);
        startActivity(janela);
        finish();
    }

}