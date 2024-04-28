package org.listasforeach.exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroFuncionario, numeroHoras;
        double valorHora, salario;

        System.out.println("Calcule seu banco de horas!");

        System.out.println("Digite seu número de identificação:");
        numeroFuncionario = scanner.nextInt();

        System.out.println("Digite o numero de horas trabalhadas:");
        numeroHoras = scanner.nextInt();

        System.out.println("Digite o valor que cobra a HORA:");
        valorHora = scanner.nextDouble();

        salario = numeroHoras * valorHora;

        System.out.printf("Número: %d%n" +
                "Salário %.2f", numeroFuncionario, salario);

    }


}
