package org.exerciciobanco;

import entities.Conta;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class ExerciciobancoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciciobancoApplication.class, args);
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Conta conta;

        System.out.print("Insira o NÚMERO IDENTIFICADOR da conta bancária:");
        int numeroConta = scanner.nextInt();

        System.out.print("Insira o NOME do TITULAR da conta bancária:");
        scanner.nextLine();
        String nomeTitular = scanner.nextLine();

        System.out.print("Deseja fazer um DEPÓSITO INICIAL? (Digite: 'S/N')");
        char responde = scanner.next().charAt(0);
        if(responde == 'S'){
            System.out.print("Insira o valor do DEPÓSITO INICIAL:");
            double depositoInicial = scanner.nextDouble();
            conta = new Conta(numeroConta, nomeTitular, depositoInicial);
        } else {
            System.out.print(" - NEGADO! Abertura de conta SEM DEPÓSITO INICIAL.");
            conta = new Conta(numeroConta, nomeTitular);
        }

        System.out.println();
        System.out.println("Dados bancários:");
        System.out.println(conta);

        System.out.print("Deseja fazer um DEPÓSITO?");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("Saldo atualizado:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Deseja fazer um saque?");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);
        System.out.println("Saldo atualizado:");
        System.out.println(conta);
    }
}
