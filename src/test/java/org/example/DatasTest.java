package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatasTest {

    @Test
    void setDataCorreta() {
        Datas data = new Datas(1,10,2020);

        assertEquals("1/10/2020",data.dataCompleta());
    }

    @Test
    void setDiaErradoMes31dias() {
        try {
            Datas data = new Datas(32,1,2020);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data Invalida, dia invalido", e.getMessage());
        }
    }

    @Test
    void setDiaErradoMes30dias() {
        try {
            Datas data = new Datas(31,4,2020);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data Invalida, dia invalido", e.getMessage());
        }
    }

    @Test
    void setDiaErradoFevereiro() {
        try {
            Datas data = new Datas(29,2,2020);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data Invalida, dia invalido", e.getMessage());
        }
    }
}