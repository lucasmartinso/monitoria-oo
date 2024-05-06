package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void getInfos() {
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado("MG", pais);
        Cidade cidade = new Cidade("JF", estado);
        Bairro bairro = new Bairro("Sao Pedro", cidade);
        Rua rua = new Rua("rua 1", bairro);
        Endereco endereco = new Endereco(1,"apto 123",rua);
        Datas data = new Datas(1,1,2001);

        Cliente cliente = new Cliente("32912345678","12345678901", endereco);
        cliente.setNome("Lucas");
        cliente.setDataNascimento(data);

        assertEquals("Lucas",cliente.getNome());
        assertEquals("1/1/2001",cliente.getDataNascimento());
    }

    @Test
    void setTelefone() {
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado("MG", pais);
        Cidade cidade = new Cidade("JF", estado);
        Bairro bairro = new Bairro("Sao Pedro", cidade);
        Rua rua = new Rua("rua 1", bairro);
        Endereco endereco = new Endereco(1,"apto 123",rua);

        Cliente cliente = new Cliente("32912345678","12345678901", endereco);

        assertEquals("(32)912345678",cliente.getTelefone());
    }

    @Test
    void setTelefoneErrado() {
        try {
            Pais pais = new Pais("Brasil");
            Estado estado = new Estado("MG", pais);
            Cidade cidade = new Cidade("JF", estado);
            Bairro bairro = new Bairro("Sao Pedro", cidade);
            Rua rua = new Rua("rua 1", bairro);
            Endereco endereco = new Endereco(1,"apto 123",rua);

            Cliente cliente = new Cliente("3291234567","12345678901", endereco);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Telefone tem que ter 11 digitos",e.getMessage());
        }
    }

    @Test
    void setCpf() {
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado("MG", pais);
        Cidade cidade = new Cidade("JF", estado);
        Bairro bairro = new Bairro("Sao Pedro", cidade);
        Rua rua = new Rua("rua 1", bairro);
        Endereco endereco = new Endereco(1,"apto 123",rua);

        Cliente cliente = new Cliente("32912345678","12345678901", endereco);

        assertEquals("123.456.789-01",cliente.getCpf());
    }

    @Test
    void setCpfErrado() {
        try {
            Pais pais = new Pais("Brasil");
            Estado estado = new Estado("MG", pais);
            Cidade cidade = new Cidade("JF", estado);
            Bairro bairro = new Bairro("Sao Pedro", cidade);
            Rua rua = new Rua("rua 1", bairro);
            Endereco endereco = new Endereco(1,"apto 123",rua);

            Cliente cliente = new Cliente("32912345678","1234567890", endereco);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CPF tem que ter 11 digitos",e.getMessage());
        }
    }
}