package com.example.cubequiz.questions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cubequiz.R;
import com.example.cubequiz.activity.MainActivity;

public class Questao6 extends AppCompatActivity {

    private Button btnA6, btnB6, btnC6, btnD6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao6);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnA6 = findViewById(R.id.btnA6);
        btnB6 = findViewById(R.id.btnB6);
        btnC6 = findViewById(R.id.btnC6);
        btnD6 = findViewById(R.id.btnD6);

        //questão certa
        btnA6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ7();
            }
        });

        btnB6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ7();
                MainActivity.acertos++;
            }
        });

        btnC6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ7();

            }
        });


        btnD6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ7();
            }
        });


    }

    private void abrirQ7() {
        Intent janela = new Intent(this, Questao7.class);
        startActivity(janela);
        finish();
    }
}