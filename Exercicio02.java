package Aula08_entrega;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        Scanner sc = new Scanner(System.in);

        System.out.println("digite a primeira nota");
        nota1=sc.nextDouble();

        System.out.println("digite a segunda nota");
        nota2=sc.nextDouble();

        System.out.println("digite a terceira nota");
        nota3=sc.nextDouble();

        System.out.println("digite a quarta nota");
        nota4=sc.nextDouble();

        media = (nota1+ nota2 + nota3 + nota4)/4;

        System.out.printf("sua media aritmetica \u00E9: %.2f", media);

    }
}
