package com.example.cubequiz.loading;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.cubequiz.R;
import com.example.cubequiz.activity.MainActivity;

public class Loading extends AppCompatActivity
{
    private WebView gifloading;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        gifloading = findViewById(R.id.gifloading);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
                finish();
            }
        }, 6000);

        WebSettings gif = gifloading.getSettings();
        gif.setJavaScriptEnabled(true);
        String caminho = "file:android_asset/gifloading.gif";
        gifloading.loadUrl(caminho);
    }
}