package org.listasforeach.exercicios.repetitivas;

import java.util.Scanner;

public class WhileExec01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senha = scanner.nextInt();

        while(senha != 2002){
            System.out.println("Senha errada!");
            senha = scanner.nextInt();
        }
        System.out.println("Acesso permitido.");
    }
}
