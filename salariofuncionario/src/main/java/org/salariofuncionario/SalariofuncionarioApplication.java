package org.salariofuncionario;

import entities.Funcionario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class SalariofuncionarioApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalariofuncionarioApplication.class, args);

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Funcionario funcionario = new Funcionario();

        System.out.println();
        System.out.println("Name: ");
        funcionario.name = scanner.nextLine();

        System.out.println("Gross Salary: ");
        funcionario.grossSalary = scanner.nextDouble();

        System.out.println("Tax: ");
        funcionario.tax = scanner.nextDouble();

        System.out.println("Employee: " + funcionario);

        System.out.println("Which percentage to increase salary?");
        double percentage = scanner.nextDouble();
        funcionario.increaseSalary(percentage);

        System.out.println("Updated data " + funcionario);

        scanner.close();
    }
}
