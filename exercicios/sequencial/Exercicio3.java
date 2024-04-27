package sequencial;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double R, A, pi = 3.14159;

        R = scanner.nextDouble();

        A = pi * R * R;

        System.out.printf("A=%.4f%n", A);

        scanner.close();

    }
}
