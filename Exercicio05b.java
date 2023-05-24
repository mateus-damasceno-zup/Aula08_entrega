package Aula08_entrega;

import java.util.Scanner;

public class Exercicio05b {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;

        Scanner sc = new Scanner(System.in);
        System.out.println("conversao de Fahrenheit para Celsius\n" +
                "Digite a temperatura em Celsius");
        celsius=sc.nextDouble();
        fahrenheit = celsius * 1.8 + 32;
        System.out.println("a temperatura convertida de Celsius para Fahrenheit é "+ fahrenheit + "ºF");


    }
}
