package com.example.cubequiz.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cubequiz.R;

public class MainActivity extends AppCompatActivity
{
    private Button btnDesenvolvedores, btnLogar, btnCadastrar;
    public static int acertos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnDesenvolvedores = findViewById(R.id.btnDesenvolvedores);
        btnLogar = findViewById(R.id.btnLogar);
        btnCadastrar = findViewById(R.id.btnCadastrar);

        btnDesenvolvedores.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirDesenvolvedores();
            }
        });

        btnLogar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirLogar();
            }
        });

        btnCadastrar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirCadastrar();
            }
        });

    }

    private void abrirDesenvolvedores()
    {
        Intent janela = new Intent(this,Desenvolvedores.class);
        startActivity(janela);
    }

    private void abrirLogar()
    {
        Intent janela = new Intent(this,Login.class);
        startActivity(janela);
    }

    private void abrirCadastrar()
    {
        Intent janela = new Intent(this,Cadastro.class);
        startActivity(janela);
    }
}