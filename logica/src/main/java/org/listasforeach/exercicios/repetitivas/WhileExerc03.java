package org.listasforeach.exercicios.repetitivas;

import java.util.Scanner;

public class WhileExerc03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = scanner.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool = alcool + 1;
            }
            else if (tipo == 2) {
                gasolina = gasolina + 1;
            }
            else if (tipo == 3) {
                diesel = diesel + 1;
            }

            tipo = scanner.nextInt();
        }
        System.out.println("Fim");
        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);


    }
}
