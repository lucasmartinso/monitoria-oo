package org.example;

public class Ator {
    private String codigoBarras;
    private Pais pais;

    public Ator(Pais pais) {
        this.setPais(pais);
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
