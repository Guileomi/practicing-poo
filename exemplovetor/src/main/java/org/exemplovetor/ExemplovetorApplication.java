package org.exemplovetor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class ExemplovetorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExemplovetorApplication.class, args);
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira um valor:");
        int n = scanner.nextInt();
        double[] vect = new double[n];

        for(int i=0; i<n; i++){
            vect[i] = scanner.nextDouble();
        }

        double soma = 0.0;
        for(int i=0; i<n; i++){
            soma += vect[i];
        }

        double media = soma / n;

        System.out.println("Média: " + media);
    }

}
