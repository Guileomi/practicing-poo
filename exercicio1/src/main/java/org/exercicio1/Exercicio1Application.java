package org.exercicio1;

import entities.Retangulo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class Exercicio1Application {

    public static void main(String[] args) {
        SpringApplication.run(Exercicio1Application.class, args);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Retangulo retangulo = new Retangulo();

        System.out.println();
        System.out.println("Enter rectangle width and height:");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        System.out.println(retangulo);
    }

}
