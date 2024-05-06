package org.example;

public class Cliente extends Pessoa{
    private Pessoa pessoa;
    private String telefone;
    private String cpf;
    private Endereco endereco;

    public Cliente(Pessoa pessoa, String telefone, String cpf, Endereco endereco) {
        this.setPessoa(pessoa);
        this.setTelefone(telefone);
        this.setCpf(cpf);
        this.setEndereco(endereco);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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
