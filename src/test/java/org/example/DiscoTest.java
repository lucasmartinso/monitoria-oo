package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DiscoTest {

    @Test
    void getFilme() {
        Categoria categoria = new Categoria("Drama");
        Pais pais = new Pais("Brasil");
        Ator ator = new Ator(pais);
        Filme filme = new Filme("Thor",categoria);
        filme.adicionaAtor(ator);

        Disco disco = new Disco(1,"abcde",filme);

        assertEquals(filme, disco.getFilme());
    }

    @Test
    void naoAlugado() {
        Categoria categoria = new Categoria("Drama");
        Pais pais = new Pais("Brasil");
        Ator ator = new Ator(pais);
        Filme filme = new Filme("Thor",categoria);
        filme.adicionaAtor(ator);

        Disco disco = new Disco(1,"abcde",filme);

        assertEquals(false, disco.isAlugado());
    }

//    @Test
//    void estaAlugado() {
//        Categoria categoria = new Categoria("Drama");
//        Pais pais = new Pais("Brasil");
//        Ator ator = new Ator(pais);
//        Filme filme = new Filme("Thor",categoria);
//        filme.adicionaAtor(ator);
//
//        Disco disco = new Disco(1,"abcde",filme);
//
//        assertEquals(false, disco.isAlugado());
//    }
}