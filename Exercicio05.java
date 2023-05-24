package Aula08_entrega;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;

        Scanner sc = new Scanner(System.in);
        System.out.println("conversao de Celsius para Fahrenheit\n" +
                "Digite a temperatura em Fahrenheit");
        fahrenheit=sc.nextDouble();
        celsius = ((fahrenheit - 32)/9)*5;
        System.out.println("a temperatura convertida de Celsius para Fahrenheit é "+ celsius + "ºC");


    }
}
