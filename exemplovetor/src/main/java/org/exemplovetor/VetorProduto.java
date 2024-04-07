package org.exemplovetor;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class VetorProduto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Insira um valor:");
        int n = scanner.nextInt();
        Product[] vect = new Product[n];


        for(int i=0; i<vect.length; i++){
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            vect[i] = new Product(name, price);
        }

        double soma = 0.0;
        for(int i=0; i<n; i++){
            soma += vect[i].getPrice();
        }

        double media = soma / n;

        System.out.println("Média: " + media);
    }
}
