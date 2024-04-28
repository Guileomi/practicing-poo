package org.listasforeach.exercicios.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int codigo, quantidade;
        double preco;

        System.out.printf("Digite um código do produto");
        codigo = scanner.nextInt();

        System.out.printf("Digite a quantidade do produto");
        quantidade = scanner.nextInt();

        if(codigo == 1){
            preco = quantidade * 4.0;
            System.out.printf("Total: %.2f", preco);
        }
        else if (codigo == 2) {
            preco = quantidade * 4.5;
            System.out.printf("Total: %.2f", preco);
        }
        else if (codigo == 3) {
            preco = quantidade * 5.0;
            System.out.printf("Total: %.2f", preco);
        }
        else if (codigo == 4) {
            preco = quantidade * 2.0;
            System.out.printf("Total: %.2f", preco);
        }
        else if (codigo == 5) {
            preco = quantidade * 1.5;
            System.out.printf("Total: %.2f", preco);
        }
        else {
            System.out.printf("Número inválido.");
        }

    }
}
