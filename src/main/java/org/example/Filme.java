package org.example;

import java.util.ArrayList;

public class Filme {
    private String titulo;
    private Categoria categoria;
    private ArrayList<Ator> atores;

    public Filme(String titulo, Categoria categoria) {
        this.setTitulo(titulo);
        this.setCategoria(categoria);
        this.atores = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void registraAtores(ArrayList<Ator> atores) {
        this.atores = atores;
    }

    public void adicionaAtor(Ator ator) {
        if(!atores.contains(ator)) {
            this.atores.add(ator);
        } else {
            throw new IllegalArgumentException("Ator ja esta na lista de integrantes do filme");
        }
    }

    public Ator excluiAtor(Ator ator) {
        if(atores.contains(ator)) {
            atores.remove(ator);
            return ator;
        } else {
            throw new IllegalArgumentException("Esse ator não consta nesse filme");
        }
    }

    public ArrayList<Ator> listaAtores() {
        return atores;
    }

    public boolean contemAtor(Ator ator) {
        if(atores.contains(ator)) return true;
        else return false;
    }
}
