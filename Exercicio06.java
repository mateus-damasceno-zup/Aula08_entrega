package Aula08_entrega;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        int numero;
        int antecessor;
        int sucessor;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero");
        numero = sc.nextInt();
        sucessor = numero+1;
        antecessor = numero-1;
        System.out.println("o numero é "+ numero +
                " seu sucessor é "+ sucessor+
                " e seu antecessor é "+ antecessor);
    }
}
