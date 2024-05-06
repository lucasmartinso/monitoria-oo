package org.example;

public class Rua {
    private String nome;
    private Bairro bairro;

    public Rua(String nome, Bairro bairro) {
        this.setNome(nome);
        this.setCidade(bairro);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCidade(Bairro bairro) {
        this.bairro = bairro;
    }
}
