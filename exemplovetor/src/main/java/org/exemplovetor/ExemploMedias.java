package org.exemplovetor;

import java.util.Locale;
import java.util.Scanner;

public class ExemploMedias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = scanner.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for(int i=0; i<n; i++){
            System.out.println("Dados da " + (i+1) + "ª pessoa");
            System.out.println("Nome: ");
            nomes[i] = scanner.next();
            System.out.println("Idade: ");
            idades[i] = scanner.nextInt();
            System.out.println("Altura: ");
            alturas[i] = scanner.nextDouble();
        }

        double soma = 0.0;
        for(int i=0; i<n; i++){
            soma = soma + alturas[i];
        }
        double mediaAlturas = soma / n;
        System.out.println();

        System.out.printf("Altura média %.2f %n", mediaAlturas);
        System.out.println();

        int contagem = 0;
        for(int i=0; i<n; i++) {
            if (idades[i] < 16) {
                contagem = contagem + 1;
            }
        }

        double percentual = contagem * 100.0 / n;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", percentual);

        for(int i=0; i<n; i++) {
            if(idades[i] < 16){
                System.out.println(nomes[i]);
            }
        }

        scanner.close();

    }
}
