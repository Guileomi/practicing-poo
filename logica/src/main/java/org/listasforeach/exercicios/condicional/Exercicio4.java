package org.listasforeach.exercicios.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo
        // pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        int horaInicio, horaFim, duracao;

        System.out.printf("Insira a hora que o jogo começou: (0-23)");
        horaInicio = scanner.nextInt();

        System.out.printf("Insira a hora final do jogo");
        horaFim = scanner.nextInt();


        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        }
        else {
            duracao = 24 - horaInicio + horaFim;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
