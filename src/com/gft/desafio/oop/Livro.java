package com.gft.desafio.oop;

public class Livro extends Produto implements Imposto{

    private String autor;
    private String tema;
    private int qtdPag;

    public Livro() {
    }

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    double imposto = 0;

    @Override
    public double calculaImposto() {
        if(getTema().equalsIgnoreCase("educativo")) {
            imposto = 0;
        } else {
            imposto = ((getQtd() * getPreco()) / 100) * 10;
        }
        return imposto;
    }

    @Override
    public String toString() {
        return "\n *** Livro *** " +
                "\nNome: " + getNome() +
                "\nAutor: " + getAutor() +
                "\nTema: " + getTema() +
                "\nQuantidade de Páginas: " + getQtdPag() +
                "\nPreço: R$ " + (getQtd() * getPreco()) +
                "\nQuantidade: " + getQtd() +
                "\nPreço total: R$ " + ((getQtd() * getPreco()) + calculaImposto()) +
                "\nImposto: R$ " + calculaImposto();
    }
}
