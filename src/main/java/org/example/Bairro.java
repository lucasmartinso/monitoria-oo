package org.example;

public class Bairro {
    private String nome;
    private Cidade cidade;

    public Bairro(String nome, Cidade cidade) {
        this.setNome(nome);
        this.setCidade(cidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
