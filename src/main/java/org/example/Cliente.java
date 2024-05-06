package org.example;

public class Cliente extends Pessoa{
    private String telefone;
    private String cpf;
    private Endereco endereco;

    public Cliente(String telefone, String cpf, Endereco endereco) {
        this.setTelefone(telefone);
        this.setCpf(cpf);
        this.setEndereco(endereco);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
