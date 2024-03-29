package org.radiuscalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import util.Calculator;
import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class RadiuscalcApplication {

    public static void main(String[] args) {
        SpringApplication.run(RadiuscalcApplication.class, args);
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value; %.2f%n", Calculator.PI);

        System.out.println();
        // Montar um IF para escolher qual UTIL usar
        System.out.println();

        System.out.println("What is the dollar price?");
        double dollarPrice = scanner.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double amount = scanner.nextDouble();
        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);

        scanner.close();
    }

}
