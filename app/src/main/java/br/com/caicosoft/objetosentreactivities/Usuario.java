package br.com.caicosoft.objetosentreactivities;

import java.io.Serializable;


// PARA PODER PASSAR OBJETO ENTRE ACTIVITIES EH NECESSARIO DEIXAR A CLASSE DO OBJETO SERIALIZABLE
public class Usuario implements Serializable {

    private String nome;
    private String email;
    private String senha;

    public Usuario() {
    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
