package org.listasforeach.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class ExemploMatriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira um número para sua matriz bidimensional: ");
        int n = scanner.nextInt();
        int[][] mat = new int[n][n];

        for(int i=0; i < mat.length; i++){
            for (int j=0; j < mat[i].length; j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("Diagonal principal: ");
        for(int i=0; i < mat.length; i++){
            System.out.println(mat[i][i] + " ");
        }
        System.out.println();

        int contagem = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j < mat[i].length; j++){
                if(mat[i][j] < 0){
                    contagem++;
                }
            }
        }
        System.out.println("Números negativos: " + contagem);

        scanner.close();
    }
}
