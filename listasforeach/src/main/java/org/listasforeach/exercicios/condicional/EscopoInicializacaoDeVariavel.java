package org.listasforeach.exercicios.condicional;

import java.util.Scanner;

public class EscopoInicializacaoDeVariavel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();

        double discount = 0; //Inicializando a variavel com um valor
        if (price > 100.0) {
            discount = price * 0.1;
        }
        System.out.println(discount); //Variavel esta na estrutura do if
    }
}
