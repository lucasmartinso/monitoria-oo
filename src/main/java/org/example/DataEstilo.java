package org.example;

public interface DataEstilo {
    void setData(Integer dia, Integer Mes, Integer Ano);
    Integer getDia();
    Integer getMes();
    Integer getAno();
    String dataCompleta();
}
