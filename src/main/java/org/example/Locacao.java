package org.example;

import java.util.ArrayList;

public class Locacao {
    private Cliente cliente;
    private Disco disco;
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

    public Disco getDiscos() {
        return this.disco;
    }


}
