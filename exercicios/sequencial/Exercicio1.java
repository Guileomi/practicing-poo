package sequencial;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String x;

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("%nProducts: %n");
        System.out.printf("%s, which price is $ %.2f %n", product1,price1);
        System.out.printf("%s, which price is $ %.2f %n%n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %c %n%n", age, code, gender);
        System.out.printf("Measue with eight decimal places: %.8f %n", measure);
        System.out.printf("Rouded (three decimal places: %.3f %n", measure);
        System.out.printf("US decimal point: %.3f %n", measure);

        x = scanner.nextLine();
        System.out.println("Terminamos? " + x);

        scanner.close();
    }
}