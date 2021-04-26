package com.example.cubequiz.questions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cubequiz.R;
import com.example.cubequiz.activity.MainActivity;
import com.example.cubequiz.activity.TelaJogar;

public class PontosFinal extends AppCompatActivity {

    private TextView txtPontosFinal;
    WebView gifFinal;
    private Button btnJogarNovamente, btnTelaInicial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pontos_final);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        txtPontosFinal = findViewById(R.id.txtPontosFinal);
        gifFinal = findViewById(R.id.gifFinal);

        btnJogarNovamente = findViewById(R.id.btnJogarNovamente);
        btnTelaInicial = findViewById(R.id.btnTelaInicial);

        txtPontosFinal.setText("Total de pontos: " + MainActivity.acertos++);

        btnJogarNovamente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirJogarNovamente();
                MainActivity.acertos = 0;
            }
        });

        btnTelaInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTelaInicial();
                MainActivity.acertos = 0;
            }
        });

        if (MainActivity.acertos < 4) {
            WebSettings gif = gifFinal.getSettings();
            gif.setJavaScriptEnabled(true);
            String caminho = "file:android_asset/vish.gif";
            gifFinal.loadUrl(caminho);
        }
        else if(MainActivity.acertos < 7 && MainActivity.acertos > 3) {
            WebSettings gif = gifFinal.getSettings();
            gif.setJavaScriptEnabled(true);
            String caminho = "file:android_asset/maisoumenos.gif";
            gifFinal.loadUrl(caminho);
        }
        else if(MainActivity.acertos < 10 && MainActivity.acertos > 6) {
            WebSettings gif = gifFinal.getSettings();
            gif.setJavaScriptEnabled(true);
            String caminho = "file:android_asset/muitobem.gif";
            gifFinal.loadUrl(caminho);
        }
        else {
            WebSettings gif = gifFinal.getSettings();
            gif.setJavaScriptEnabled(true);
            String caminho = "file:android_asset/gabaritou.gif";
            gifFinal.loadUrl(caminho);
        }

    }

    private void abrirJogarNovamente() {
        Intent janela = new Intent(this, TelaJogar.class);
        startActivity(janela);
        finish();
    }

    private void abrirTelaInicial() {
        Intent janela = new Intent(this, MainActivity.class);
        startActivity(janela);
        finish();
    }

}