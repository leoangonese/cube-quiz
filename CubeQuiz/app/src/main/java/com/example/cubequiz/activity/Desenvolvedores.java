package com.example.cubequiz.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.cubequiz.R;
import com.example.cubequiz.fragment.CrisFragment;
import com.example.cubequiz.fragment.GuiFragment;
import com.example.cubequiz.fragment.JoaoFragment;
import com.example.cubequiz.fragment.LeoFragment;

public class Desenvolvedores extends AppCompatActivity
{
    private Button btnCris, btnJoao, btnLeo, btnGui, vDes;
    private CrisFragment crisFragment;
    private JoaoFragment joaoFragment;
    private GuiFragment guiFragment;
    private LeoFragment leoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desenvolvedores);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnCris = findViewById(R.id.btnCris);
        btnJoao = findViewById(R.id.btnJoao);
        btnGui = findViewById(R.id.btnGui);
        btnLeo = findViewById(R.id.btnLeo);

        vDes = findViewById(R.id.vDes);

        btnCris.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                crisFragment = new CrisFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameDes, crisFragment);
                transaction.commit();
            }
        });

        btnJoao.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                joaoFragment = new JoaoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameDes, joaoFragment);
                transaction.commit();
            }
        });

        btnGui.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                guiFragment = new GuiFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameDes, guiFragment);
                transaction.commit();
            }
        });

        btnLeo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                leoFragment = new LeoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameDes, leoFragment);
                transaction.commit();
            }
        });

        vDes.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirMainActivity();
            }
        });
    }

    private void abrirMainActivity()
    {
        Intent janela = new Intent(this, MainActivity.class);
        startActivity(janela);
    }
}