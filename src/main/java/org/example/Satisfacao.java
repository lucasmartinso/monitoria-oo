package org.example;

public class Satisfacao extends Locacao {
    private Integer notaAtendimento;
    private Integer notaFilme;

    public Satisfacao(Locacao locacao, Integer notaAtendimento, Integer notaFilme) {

    }

    public Integer getNotaAtendimento() {
        return notaAtendimento;
    }

    public void setNotaAtendimento(Integer notaAtendimento) {
        if(notaAtendimento>=0 && notaAtendimento<=10) {
            this.notaAtendimento = notaAtendimento;
        } else {
            throw new IllegalArgumentException("Nota tem que ser de 0 a 10");
        }
    }

    public Integer getNotaFilme() {
        return notaFilme;
    }

    public void setNotaFilme(Integer notaFilme) {
        if(notaFilme>=0 && notaFilme<=10) {
            this.notaFilme = notaFilme;
        } else {
            throw new IllegalArgumentException("Nota tem que ser de 0 a 10");
        }
    }
}
