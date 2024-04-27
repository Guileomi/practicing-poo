package sequencial;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b, c, d, diferenca;

        System.out.printf("DIFERENÇA DE PARES - Insira QUATRO valores:\n");

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        diferenca = (a * b - c * d);


        System.out.printf("A DIFERENÇA entre os valores é: %d", diferenca);


    }
}
