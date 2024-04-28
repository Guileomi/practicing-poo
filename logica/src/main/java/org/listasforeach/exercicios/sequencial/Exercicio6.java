package org.listasforeach.exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Código, quantidade e valor de peça (roupa)
        int codigoPeca1, quantidadePeca1, codigoPeca2, quantidadePeca2;
        double valorPeca1, valorPeca2, valorTotal;

        System.out.println("Mercado de peças");

        System.out.println("Insira o código da primeira peça:");
        codigoPeca1 = scanner.nextInt();

        System.out.println("Insira a quantidade de peças deste mesmo código:");
        quantidadePeca1 = scanner.nextInt();

        System.out.println("Insira o valor unitário da primeira peça:");
        valorPeca1 = scanner.nextDouble();

        System.out.println("--/--");

        System.out.println("Insira o código da segunda peça:");
        codigoPeca2 = scanner.nextInt();

        System.out.println("Insira a quantidade de peças deste mesmo código:");
        quantidadePeca2 = scanner.nextInt();

        System.out.println("Insira o valor unitário da segunda peça:");
        valorPeca2 = scanner.nextDouble();

        valorTotal = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);

        System.out.printf("Valor a pagar: %.2f", valorTotal);




    }
}
