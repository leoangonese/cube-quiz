package com.example.cubequiz.questions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cubequiz.R;
import com.example.cubequiz.activity.MainActivity;

public class Questao5 extends AppCompatActivity {

    private Button btnA5, btnB5, btnC5, btnD5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao5);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnA5 = findViewById(R.id.btnA5);
        btnB5 = findViewById(R.id.btnB5);
        btnC5 = findViewById(R.id.btnC5);
        btnD5 = findViewById(R.id.btnD5);

        //questão certa
        btnA5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ6();
                MainActivity.acertos++;
            }
        });

        btnB5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ6();
            }
        });

        btnC5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ6();

            }
        });


        btnD5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ6();
            }
        });


    }

    private void abrirQ6() {
        Intent janela = new Intent(this, Questao6.class);
        startActivity(janela);
        finish();
    }
}