package org.example;

public class Ator {
    private Pessoa pessoa;
    private String codigoBarras;
    private Pais pais;

    public Ator(Pessoa pessoa, String codigoBarras, Pais pais) {
        this.setPessoa(pessoa);
        this.setCodigoBarras(codigoBarras);
        this.setPais(pais);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
