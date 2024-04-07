package org.exemplovetor;

import java.util.Locale;
import java.util.Scanner;

public class ExemploNegativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quantos numeros voce vai digitar?");

        int n = scanner.nextInt();
        int[] vet = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Digite um número: ");
            vet[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.println("NUMEROS NEGATIVOS");
        for (int i=0; i<n; i++){
            if(vet[i] < 0){
                System.out.println(vet[i]);
            }
        }
    }
}
