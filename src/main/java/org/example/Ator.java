package org.example;

public class Ator {
    private Pessoa pessoa;
    private String codigoBarras;
    private Pais pais;

    public Ator(Pessoa pessoa, Pais pais) {
        this.setPessoa(pessoa);
        this.setPais(pais);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
