package org.example;

public class Datas implements DataEstilo {
    private Integer dia;
    private Integer mes;
    private Integer ano;

    public Datas(Integer dia, Integer mes, Integer ano) {
        this.setData(dia, mes, ano);
    }
   @Override
   public void setData(Integer dia, Integer mes, Integer ano) {
       if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
            if(dia>=1 && dia<=31) {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            } else {
                throw new IllegalArgumentException("Data Invalida, dia invalido");
            }
       } else if(mes==4 || mes==6 || mes==9 || mes==11) {
           if(dia>=1 && dia<=30) {
               this.dia = dia;
               this.mes = mes;
               this.ano = ano;
           } else {
               throw new IllegalArgumentException("Data Invalida, dia invalido");
           }
       } else if(mes==2) {
           if(dia>=1 && dia<=28) {
               this.dia = dia;
               this.mes = mes;
               this.ano = ano;
           } else {
               throw new IllegalArgumentException("Data Invalida, dia invalido");
           }
       } else {
            throw new IllegalArgumentException("Data Invalida, mes invalido");
       }
   }

    @Override
    public Integer getDia() {
        return dia;
    }

    @Override
    public Integer getMes() {
        return mes;
    }

    @Override
    public Integer getAno() {
        return ano;
    }

    public String dataCompleta() {
        String date = this.dia + "/" + this.mes + "/" + this.ano;

        return date;
    }
}
