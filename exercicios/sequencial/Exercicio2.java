package sequencial;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero1, numero2, soma;

        System.out.printf("\n\n Calcule - SOMA: \n" +
                "Digite o primeiro número: \n");
        numero1 = scanner.nextInt();

        System.out.printf("Digite o segundo número: \n");
        numero2 = scanner.nextInt();

        soma = numero1 + numero2;

        System.out.printf("\n++++++++++++++++++++++++\n\n");

        System.out.printf("O RESULTADO DESSA SOMA É: %d \n", soma);

    }
}
