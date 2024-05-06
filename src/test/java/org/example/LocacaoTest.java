package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocacaoTest {

    @Test
    void setNotaAtendimentoErrado() {
        try {
            Pais pais = new Pais("Brasil");
            Estado estado = new Estado("MG", pais);
            Cidade cidade = new Cidade("JF", estado);
            Bairro bairro = new Bairro("Sao Pedro", cidade);
            Rua rua = new Rua("rua 1", bairro);
            Endereco endereco = new Endereco(1,"apto 123",rua);
            Cliente cliente = new Cliente("32912345678","12345678901", endereco);

            Categoria categoria = new Categoria("Drama");
            Ator ator = new Ator(pais);
            Filme filme = new Filme("Thor",categoria);
            filme.adicionaAtor(ator);
            Disco disco = new Disco(1,"abcde",filme);

            Datas retirada = new Datas(1,1,2024);
            Datas devolucao = new Datas(4,1,2024);
            Locacao locacao = new Locacao(cliente,disco,retirada,devolucao);
            locacao.setNotaAtendimento(11);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nota tem que ser de 1 a 10",e.getMessage());
        }

    }

    @Test
    void setNotaFilme() {
        try {
            Pais pais = new Pais("Brasil");
            Estado estado = new Estado("MG", pais);
            Cidade cidade = new Cidade("JF", estado);
            Bairro bairro = new Bairro("Sao Pedro", cidade);
            Rua rua = new Rua("rua 1", bairro);
            Endereco endereco = new Endereco(1,"apto 123",rua);
            Cliente cliente = new Cliente("32912345678","12345678901", endereco);

            Categoria categoria = new Categoria("Drama");
            Ator ator = new Ator(pais);
            Filme filme = new Filme("Thor",categoria);
            filme.adicionaAtor(ator);
            Disco disco = new Disco(1,"abcde",filme);

            Datas retirada = new Datas(1,1,2024);
            Datas devolucao = new Datas(4,1,2024);
            Locacao locacao = new Locacao(cliente,disco,retirada,devolucao);
            locacao.setNotaFilme(11);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nota tem que ser de 1 a 10",e.getMessage());
        }

    }

    @Test
    void comparaDatas() {
        try {
            Pais pais = new Pais("Brasil");
            Estado estado = new Estado("MG", pais);
            Cidade cidade = new Cidade("JF", estado);
            Bairro bairro = new Bairro("Sao Pedro", cidade);
            Rua rua = new Rua("rua 1", bairro);
            Endereco endereco = new Endereco(1,"apto 123",rua);
            Cliente cliente = new Cliente("32912345678","12345678901", endereco);

            Categoria categoria = new Categoria("Drama");
            Ator ator = new Ator(pais);
            Filme filme = new Filme("Thor",categoria);
            filme.adicionaAtor(ator);
            Disco disco = new Disco(1,"abcde",filme);

            Datas retirada = new Datas(1,1,2024);
            Datas devolucao = new Datas(4,5,2023);
            Locacao locacao = new Locacao(cliente,disco,retirada,devolucao);
            locacao.setNotaAtendimento(11);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data de devolucao tem que ser maior ou igual a data de Retirada",e.getMessage());
        }

    }

    @Test
    void valorALuguel() {
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado("MG", pais);
        Cidade cidade = new Cidade("JF", estado);
        Bairro bairro = new Bairro("Sao Pedro", cidade);
        Rua rua = new Rua("rua 1", bairro);
        Endereco endereco = new Endereco(1,"apto 123",rua);
        Cliente cliente = new Cliente("32912345678","12345678901", endereco);

        Categoria categoria = new Categoria("Drama");
        Ator ator = new Ator(pais);
        Filme filme = new Filme("Thor",categoria);
        filme.adicionaAtor(ator);
        Disco disco = new Disco(1,"abcde",filme);

        Datas retirada = new Datas(1,1,2024);
        Datas devolucao = new Datas(5,1,2024);
        Locacao locacao = new Locacao(cliente,disco,retirada,devolucao);
        locacao.devolver();

        assertEquals(10,locacao.valorALuguel(4));
    }
}