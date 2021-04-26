package com.example.cubequiz.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
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

public class Cadastro extends AppCompatActivity
{
    private Button btnLimpar, btn_registrar_register, btn_login_register;
    private EditText edt_email_register, edt_senha_register, edt_confirmar_senha_register;

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Mapeamento dos edtTexts
        edt_email_register = findViewById(R.id.edt_email_register);
        edt_senha_register = findViewById(R.id.edt_senha_register);
        edt_confirmar_senha_register = findViewById(R.id.edt_confirmar_senha_register);
        //Mapeamento dos BTNS
        btnLimpar = findViewById(R.id.btnLimpar);
        btn_login_register = findViewById(R.id.btn_login_register);
        btn_registrar_register = findViewById(R.id.btn_registrar_register);
        //Instaciamento firebase auth
        mAuth = FirebaseAuth.getInstance();


        btn_registrar_register.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String registerEmail = edt_email_register.getText().toString();
                String senha = edt_senha_register.getText().toString();
                String confirmarSenha = edt_confirmar_senha_register.getText().toString();

                //Validar digitação
                if(!TextUtils.isEmpty(registerEmail) || !TextUtils.isEmpty(senha) || !TextUtils.isEmpty(confirmarSenha))
                {
                    if(senha.equals(confirmarSenha))
                    {
                        mAuth.createUserWithEmailAndPassword(registerEmail, senha).addOnCompleteListener(new OnCompleteListener<AuthResult>()
                        {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task)
                            {
                                if(task.isSuccessful())
                                {
                                    abrirTelaPrincipal();
                                }
                                else
                                {
                                    String error = task.getException().getMessage();
                                    Toast.makeText(Cadastro.this, ""+ error, Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }else
                    {
                        Toast.makeText(Cadastro.this, "As senhas devem ser iguais!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btn_login_register.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent janela = new Intent(Cadastro.this, Login.class);
                startActivity(janela);
                finish();
            }
        });

    }

    private void abrirTelaPrincipal()
    {
        Intent janela = new Intent(this, TelaJogar.class);
        startActivity(janela);
        finish();
    }

}