package com.example.cubequiz.questions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.cubequiz.R;
import com.example.cubequiz.activity.MainActivity;

public class Questao3 extends AppCompatActivity {

    private Button btnA3, btnB3, btnC3, btnD3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnA3 = findViewById(R.id.btnA3);
        btnB3 = findViewById(R.id.btnB3);
        btnC3 = findViewById(R.id.btnC3);
        btnD3 = findViewById(R.id.btnD3);

        btnA3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ4();
            }
        });

        btnB3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ4();
            }
        });

        btnC3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ4();

            }
        });

        //Questão correta
        btnD3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ4();
                MainActivity.acertos++;
            }
        });


    }

    private void abrirQ4() {
        Intent janela = new Intent(this, Questao4.class);
        startActivity(janela);
        finish();
    }
}