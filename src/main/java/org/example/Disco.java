package org.example;

public class Disco {
    private Integer numero;
    private String codigoBarras;
    private Filme filme;
    private boolean alugado;

    public Disco(Integer numero, String codigoBarras, Filme filme) {
        this.setNumero(numero);
        this.setCodigoBarras(codigoBarras);
        this.setFilme(filme);
        this.setAlugado(false);
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
}
