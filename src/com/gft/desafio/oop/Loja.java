package com.gft.desafio.oop;

import com.gft.desafio.oop.Livro;
import com.gft.desafio.oop.VideoGame;

import java.util.List;

import static java.lang.System.*;

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

    private static void accept(Livro livro) {
        out.println("[Título: " + livro.getNome() + " ,"
                + String.format("Preço: %.2f", livro.getPreco() + " ," + " Quantidade: "
                + livro.getQtd() + "]\n"));
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

        if(this.getLivros().isEmpty()) {
            out.println("\nA Loja " + this.getNome() + " não tem Livros no seu estoque. \n");

        } else {
            out.println("A Loja " + this.getNome() + " possui estes livros para venda: \n");

            getLivros().forEach(Loja::accept);

        }
    }

    public void listaVideoGames() {


        if (this.getVideoGame().isEmpty()) {

            out.println("\n A Loja " + this.getNome() + " não tem Videogames no seu estoque. \n");

        } else {
            out.println(" A Loja " + this.getNome() + " possui estes video-games para venda: \n");
            // getVideoGames().stream().forEach(System.out::println);

            getVideoGame().forEach(game -> {

                out.println(" [Título: " + game.getNome() + " ,"
                        + String.format(" Preço: %.2f", game.getPreco()) + " ," + " Quantidade: "
                        + game.getQtd() + "]\n");

            });

        }
    }

    double somaPatrimonioLivro;
    double somaPatrimonioVideo;
    
    public double calculaPatrimonio() {

        getLivros().forEach(livro -> somaPatrimonioLivro  += (livro.getPreco() * livro.getQtd()));

        getVideoGame().forEach(video -> somaPatrimonioVideo += (video.getPreco() * video.getQtd()));

        return somaPatrimonioLivro + somaPatrimonioVideo;
    }

    @Override
    public String toString() {
        return "\n Nome da Loja: " + getNome() + "\n" + " CNPJ: " + getCnpj();
    }

}

