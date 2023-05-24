package Aula08_entrega;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        double metros;
        double centimetros;

        Scanner sc = new Scanner(System.in);
        System.out.println("conversao de metros para centimetros\n");
        System.out.println("digite um valor em metros");
        metros = sc.nextDouble();
        centimetros = metros *100;
        System.out.println("o valor convertido é " + centimetros + "cm");

    }

}
