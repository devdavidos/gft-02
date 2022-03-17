package com.gft.desafio.loja;

import com.gft.desafio.oop.Livro;
import com.gft.desafio.oop.VideoGame;

import java.util.List;

public class Loja extends Livro{

    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGame;

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGame) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGame = videoGame;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGame() {
        return videoGame;
    }

    public void setVideoGame(List<VideoGame> videoGame) {
        this.videoGame = videoGame;
    }

    public void listaLivros() {
        System.out.println();
    }

    public void listaVideoGames() {

    }

    public double calculaPatrimonio() {

        return 0;
    }
}

