package com.example.cubequiz.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.cubequiz.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;



public class Login extends AppCompatActivity {
    private Button  btnCadastro;
    private Button btnLogin;
    private EditText btnUserPasswd, btnUserLogin;

    private FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        inicializarComponentes();

        btnLogin = findViewById(R.id.btnLogin);
        btnUserLogin = findViewById(R.id.btnUserLogin);
        btnUserPasswd = findViewById(R.id.btnUserPasswd);
        btnCadastro = findViewById(R.id.btnCadastro);

        btnCadastro.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirCadastro();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String email = btnUserLogin.getText().toString().trim();
                String senha = btnUserPasswd.getText().toString().trim();
                login(email, senha);
            }
        });

    }

    private void abrirCadastro()
    {
        Intent janela = new Intent(this, Cadastro.class);
        startActivity(janela);
    }

    private void login(String email, String senha)
    {
        auth.signInWithEmailAndPassword(email, senha)
                .addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>()
                {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task)
                    {
                        if(task.isSuccessful())
                        {
                            Intent i = new Intent(Login.this, TelaJogar.class);
                            startActivity(i);
                        }
                        else
                        {
                            alert("E-mail ou senha incorretos");
                        }
                    }
                });
    }

    private void alert(String s)
    {
        Toast.makeText(Login.this , s , Toast.LENGTH_SHORT).show();
    }

    private void inicializarComponentes()
    {
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        auth = Conexao.getFirebaseAuth();
    }
}