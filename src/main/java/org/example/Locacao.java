package org.example;

import java.util.ArrayList;

public class Locacao {
    private Cliente cliente;
    private Disco disco;
    private Integer notaAtendimento;
    private Integer notaFilme;
    //private Datas dataRetirada;
    //private Datas dataDevolucao;

    public Locacao(Cliente cliente, Disco disco) {
        this.setCliente(cliente);
        this.setDisco(disco);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDisco(Disco disco) {
        this.disco = disco;
    }

    public Disco getDisco() {
        return this.disco;
    }

    public Integer getNotaAtendimento() {
        return notaAtendimento;
    }

    public void setNotaAtendimento(Integer notaAtendimento) {
        if(notaAtendimento>=0 && notaAtendimento<=10) {
            this.notaAtendimento = notaAtendimento;
        } else {
            throw new IllegalArgumentException("Nota tem que ser de 1 a 10");
        }
    }

    public Integer getNotaFilme() {
        return notaFilme;
    }

    public void setNotaFilme(Integer notaFilme) {
        if(notaFilme>=0 && notaFilme<=10) {
            this.notaFilme = notaFilme;
        } else {
            throw new IllegalArgumentException("Nota tem que ser de 1 a 10");
        }
    }
}
