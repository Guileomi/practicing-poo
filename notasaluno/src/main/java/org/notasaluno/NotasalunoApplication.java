package org.notasaluno;

import entities.Estudante;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class NotasalunoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotasalunoApplication.class, args);
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Estudante estudante = new Estudante();

        System.out.println();
        System.out.println("Name: ");
        estudante.name = scanner.nextLine();

        System.out.println("Nota1:");
        estudante.nota1 = scanner.nextDouble();

        System.out.println("Nota2:");
        estudante.nota2 = scanner.nextDouble();

        System.out.println("Nota3:");
        estudante.nota3 = scanner.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", estudante.totalValue());
        if (estudante.totalValue() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", estudante.missingPoint());
        }
        else {
            System.out.println("PASS");
        }
        scanner.close();
    }

}
