package com.example.cubequiz.modelo;

public class Pessoa
{
    private String id;
    private String nome;
    private String email;
    private String senha;

    public Pessoa(String id, String nome, String email, String senha)
    {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Pessoa() {

    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getSenha()
    {
        return senha;
    }

    public void setSenha(String senha)
    {
        this.senha = senha;
    }

    @Override
    public String toString()
    {
        return "Pessoa{}";
    }
}
