package Aula08_entrega;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double horasTrabalhadas;
        double valorHora;
        double salarioMes;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite as horas trabalhadas no mês");
        horasTrabalhadas =sc.nextDouble();
        System.out.println("digite o valor da hora");
        valorHora=sc.nextDouble();
        salarioMes = horasTrabalhadas*valorHora;
        System.out.println("seu salario no mes atual é de: "+ salarioMes);
    }
}
