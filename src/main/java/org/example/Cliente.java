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
        String telefoneFormatado += "(";

        for(int i=0; i<this.telefone.length(); i++) {
            telefoneFormatado += this.telefone.charAt(i);

            if(i==1) telefoneFormatado += ")";
        }

        return telefoneFormatado;
    }

    public void setTelefone(String telefone) {
        if(telefone.length()==11) {
            this.telefone = telefone;
        } else {
            throw new IllegalArgumentException("Telefone tem que ter 11 digitos");
        }
    }

    public String getCpf() {
        String cpfFormatado = "";

        for(int i=0; i<this.cpf.length(); i++) {
            cpfFormatado += this.cpf.charAt(i);

            if(i==2 || i==5) cpfFormatado += ".";
            else if(i==8) cpfFormatado += "-";
        }

        return cpfFormatado;
    }

    public void setCpf(String cpf) {
        if(cpf.length()==11) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF tem que ter 11 digitos");
        }
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
