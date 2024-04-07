package org.exemplovetor;

import entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class AluguelEstudante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Estudante[] vect = new Estudante[10];

        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();

        for (int i=0; i<n; i++){
            System.out.println();
            System.out.println("Aluguel #" + i + ":");
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int room = scanner.nextInt();
            vect[room] = new Estudante(name, email);
        }

        System.out.println();
        System.out.println("Quartos alugados:");
        for (int i=0; i<10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
    }
}
