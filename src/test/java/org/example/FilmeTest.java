package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {

    @org.junit.jupiter.api.Test
    void registraAtores() {
        Categoria categoria = new Categoria("Drama");
        Pais brasil = new Pais("Brasil");
        Pais portugal = new Pais("Portugal");
        Ator ator1 = new Ator(brasil);
        Ator ator2 = new Ator(portugal);
        Filme filme = new Filme("Thor",categoria);

        ArrayList<Ator> atores = new ArrayList<>(Arrays.asList(ator1,ator2));
        filme.registraAtores(atores);

        assertEquals(atores,filme.listaAtores());
    }

    @org.junit.jupiter.api.Test
    void adicionaAtor() {
        Categoria categoria = new Categoria("Drama");
        Pais pais = new Pais("Brasil");
        Ator ator = new Ator(pais);
        Filme filme = new Filme("Thor",categoria);
        filme.adicionaAtor(ator);

        ArrayList<Ator> atores = new ArrayList<>(Arrays.asList(ator));

        assertEquals(atores,filme.listaAtores());
    }

    @org.junit.jupiter.api.Test
    void excluiAtor() {
        Categoria categoria = new Categoria("Drama");
        Pais brasil = new Pais("Brasil");
        Pais portugal = new Pais("Portugal");
        Ator ator1 = new Ator(brasil);
        Ator ator2 = new Ator(portugal);
        Filme filme = new Filme("Thor",categoria);

        ArrayList<Ator> atores = new ArrayList<>(Arrays.asList(ator1,ator2));
        filme.registraAtores(atores);
        filme.excluiAtor(ator2);
        atores.remove(ator2);

        assertEquals(atores,filme.listaAtores());
    }

    @org.junit.jupiter.api.Test
    void excluiAtorErrado() {
        try {
            Categoria categoria = new Categoria("Drama");
            Pais brasil = new Pais("Brasil");
            Pais portugal = new Pais("Portugal");
            Ator ator1 = new Ator(brasil);
            Ator ator2 = new Ator(portugal);
            Filme filme = new Filme("Thor",categoria);

            ArrayList<Ator> atores = new ArrayList<>(Arrays.asList(ator1));
            filme.registraAtores(atores);
            filme.excluiAtor(ator2);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Esse ator não consta nesse filme",e.getMessage());
        }

    }

    @org.junit.jupiter.api.Test
    void adicionaAtorRepetido() {
        try {
            Categoria categoria = new Categoria("Drama");
            Pais brasil = new Pais("Brasil");
            Pais portugal = new Pais("Portugal");
            Ator ator1 = new Ator(brasil);
            Filme filme = new Filme("Thor", categoria);

            filme.adicionaAtor(ator1);
            filme.adicionaAtor(ator1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ator ja esta na lista de integrantes do filme", e.getMessage());
        }
    }
}