package org.example;

public abstract class Pessoa {
    private String nome;
    //private Datas dataNascimento;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
