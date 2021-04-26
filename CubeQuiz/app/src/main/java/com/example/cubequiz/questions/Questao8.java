package com.example.cubequiz.questions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cubequiz.R;
import com.example.cubequiz.activity.MainActivity;

public class Questao8 extends AppCompatActivity {

    private Button btnA8, btnB8, btnC8, btnD8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao8);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnA8 = findViewById(R.id.btnA8);
        btnB8 = findViewById(R.id.btnB8);
        btnC8 = findViewById(R.id.btnC8);
        btnD8 = findViewById(R.id.btnD8);


        btnA8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ9();
            }
        });

        btnB8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ9();
            }
        });

        btnC8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ9();

            }
        });


        btnD8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ9();
                MainActivity.acertos++;
            }
        });


    }

    private void abrirQ9() {
        Intent janela = new Intent(this, Questao9.class);
        startActivity(janela);
        finish();
    }
}