package com.gft.desafio.bhaskara;

import java.util.Scanner;

public class Bhaskara {

    public static double a;
    public static double b;
    public static double c;
    public static double delta;
    public static double x1;
    public static double x2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor de A: ");
        a = scan.nextDouble();

        if( a == 0 ) {
            System.out.println("Impossível calcular!!");
        }

        System.out.println("Valor de B: ");
        b = scan.nextDouble();

        System.out.println("Valor de C: ");
        c = scan.nextDouble();

        delta = Math.pow(b,2) - (4 * a * c);

        if(delta < 0 ) {
            System.out.println("Impossível Calcular !!");
        }

        System.out.printf("Delta: %.2f", delta);

        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("\nx1: %.5f", x1);
        System.out.printf("\nx2: %.5f", x2);

    }
}
