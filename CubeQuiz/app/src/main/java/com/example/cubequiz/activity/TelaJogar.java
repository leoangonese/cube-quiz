package com.example.cubequiz.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cubequiz.R;
import com.example.cubequiz.questions.Questao1;

public class TelaJogar extends AppCompatActivity
{
    private WebView gifJogar;
    private Button btnJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogar);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        gifJogar = findViewById(R.id.gifJogar);
        btnJogar = findViewById(R.id.btnJogar);

        WebSettings gif = gifJogar.getSettings();
        gif.setJavaScriptEnabled(true);
        String caminho = "file:android_asset/jogar.gif";
        gifJogar.loadUrl(caminho);

        btnJogar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirJogo();
            }
        });
    }

    private void abrirJogo()
    {
        Intent janela = new Intent(this, Questao1.class);
        startActivity(janela);
    }
}