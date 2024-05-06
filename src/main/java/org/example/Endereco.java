package org.example;

public class Endereco {
    private Integer numero;
    private String complemento;
    private Rua rua;

    public Endereco(Integer numero, String complemento, Rua rua) {
        this.setNumero(numero);
        this.setComplemento(complemento);
        this.setRua(rua);
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setRua(Rua rua) {
        this.rua = rua;
    }
}
