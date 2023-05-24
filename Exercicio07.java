package Aula08_entrega;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        double horasTrabalhadas;
        double valorHora;
        double salarioMes;
        double inss;
        double sindicato;
        double ir;
        double salarioLiquido;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite as horas trabalhadas no mês");
        horasTrabalhadas =sc.nextDouble();
        System.out.println("digite o valor da hora");
        valorHora=sc.nextDouble();
        salarioMes = horasTrabalhadas*valorHora;
        ir = salarioMes * 0.11;
        inss = salarioMes * 0.08;
        sindicato = salarioMes * 0.05;
        salarioLiquido = salarioMes - ir - inss - sindicato;

        System.out.println("a) seu salario bruto no mes atual é de: R$"+ salarioMes);
        System.out.println("b) voce pagou ao inss R$" + inss);
        System.out.println("c) voce pagou ao sindicato R$"+ sindicato);
        System.out.println("d) voce pagou de imposto de renda R$"+ ir);
        System.out.println("e) salario liquido R$" + salarioLiquido);

    }
}
