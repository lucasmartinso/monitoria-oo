package org.example;

import java.util.ArrayList;

public class Locacao {
    private Cliente cliente;
    private Disco disco;
    private Integer notaAtendimento;
    private Integer notaFilme;
    private Datas dataRetirada;
    private Datas dataDevolucao;

    public Locacao(Cliente cliente, Disco disco, Datas dataRetirada, Datas dataDevolucao) {
        this.setCliente(cliente);
        this.setDisco(disco);
        this.setDataRetirada(dataRetirada, dataDevolucao);
        this.setDataDevolucao(dataRetirada, dataDevolucao);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDisco(Disco disco) {
        this.disco = disco;
        this.disco.setAlugado(true);
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

    public String getDataRetirada() {
        return dataRetirada.dataCompleta();
    }

    public void setDataRetirada(Datas dataRetirada, Datas dataDevolucao) {
        this.comparaDatas(dataRetirada,dataDevolucao);
        this.dataRetirada = dataRetirada;
    }

    public String getDataDevolucao() {
        return dataDevolucao.dataCompleta();
    }

    public void setDataDevolucao(Datas dataRetirada,Datas dataDevolucao) {
        this.comparaDatas(dataRetirada,dataDevolucao);
        this.dataDevolucao = dataDevolucao;
    }

    public void comparaDatas(Datas dataRetirada, Datas dataDevolucao) {
        if(dataDevolucao.getAno()>dataRetirada.getAno()) {
            return;
        } else if(dataDevolucao.getAno().equals(dataRetirada.getAno())) {
            if (dataDevolucao.getMes() > dataRetirada.getMes()) {
                return;
            } else if (dataDevolucao.getMes().equals(dataRetirada.getMes())) {
                if (dataDevolucao.getDia() >= dataRetirada.getDia()) {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Data de devolucao tem que ser maior ou igual a data de Retirada");
        }
    }

    public void devolver() {
        this.disco.setAlugado(false);
    }

    public float valorALuguel(Integer dias) {
        return 2.5f*dias;
    }
}
