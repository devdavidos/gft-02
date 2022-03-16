package com.gft.desafio.oop;

public class Test {
    public static void main(String[] args) {

        Livro livro = new Livro("Harry Potter", 120, 1, "J.K Rowling",
                "educativo",  470 );

        VideoGame videoGame = new VideoGame("PlayStation 4", 4500 ,
                3, "Sony", "Console" , true);


        System.out.println(livro);
        System.out.println(videoGame);
    }
}
