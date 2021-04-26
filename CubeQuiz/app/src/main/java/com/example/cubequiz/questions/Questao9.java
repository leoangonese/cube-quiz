package com.example.cubequiz.questions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cubequiz.R;
import com.example.cubequiz.activity.MainActivity;

public class Questao9 extends AppCompatActivity {

    private Button btnA9, btnB9, btnC9, btnD9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao9);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnA9 = findViewById(R.id.btnA9);
        btnB9 = findViewById(R.id.btnB9);
        btnC9 = findViewById(R.id.btnC9);
        btnD9 = findViewById(R.id.btnD9);


        btnA9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ10();
            }
        });

        btnB9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ10();
            }
        });

        btnC9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ10();
                MainActivity.acertos++;
            }
        });


        btnD9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ10();
            }
        });


    }

    private void abrirQ10() {
        Intent janela = new Intent(this, Questao10.class);
        startActivity(janela);
        finish();
    }
}