package com.gft.desafio.loja;

import com.gft.desafio.oop.Livro;
import com.gft.desafio.oop.VideoGame;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Livro livro1 = new Livro("Harry Potter", 40.0,50,
                "J.K. Rowling", "fantasia", 300);

        Livro livro2 = new Livro("Senhor dos Anéis",60,30,
                "J.R.R. Tolkien","fantasia", 500);

        Livro livro3 = new Livro("Java POO",20,50,
                "GFT","educativo",500);

        VideoGame ps4 = new VideoGame("PlayStation 4",1800,100,
                "Sony","Slim",false);

        VideoGame ps4Usado = new VideoGame("PlayStation 4", 1000,7,
                "Sony","Slim",true);

        VideoGame xbox = new VideoGame("XBOX",1500,500,
                "Microsoft","One",false);

        List<Livro> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);

        List<VideoGame> games = new ArrayList<>();
        games.add(ps4);
        games.add(ps4Usado);
        games.add(xbox);

        Loja amazon = new Loja("amazon", "38.478.828/0001-22",
                livros, games);

        System.out.println(" ------- Testando calculo de Impostos -------");
        System.out.println(livro1.calculaImposto());
        System.out.println(livro2.calculaImposto());
        System.out.println(livro3.calculaImposto());
        System.out.println(ps4.calculaImposto());
        System.out.println(ps4Usado.calculaImposto());
        System.out.println(xbox.calculaImposto());
        System.out.println(" ------- Fim do Teste do calculo de Impostos ------- ");

        System.out.println();

        System.out.println(" ------- Testando métodos listaLivros e listaVideoGames ------- ");
        amazon.listaLivros();
        amazon.listaLivros();
        System.out.println(" ------- Fim dos testes dos métodos listraLivros e listaVideoGames ------- ");

        System.out.println();

        System.out.println(" ------- Testando método calculaPatrionio ------- ");
        System.out.println("O patrimônio da loja " + amazon.getNome() + " é igual a R$ " + amazon.calculaPatrimonio());
        System.out.println(" ------- Fim do teste ------- ");




    }
}
