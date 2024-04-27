package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;

        System.out.printf("POSITIVOS E NEGATIVOS \n");
        System.out.printf("Digite um número:");
        numero = scanner.nextInt();

        if(numero < 0){
            System.out.printf("%d é NEGATIVO!", numero);
        }
        else if (numero >= 0) {
            System.out.printf("%d NÃO é NEGATIVO!", numero);
        }
        scanner.close();
    }
}
