package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double numero;
        System.out.printf("Digite um número:");
        numero = scanner.nextDouble();

        if(numero <= 0){
            System.out.printf("Fora do intervalo!");
        }
        else if (numero >= 0 && numero <=25) {
            System.out.printf("Intervalo [0.25]");
        }
        else if (numero >= 25 && numero <=50) {
            System.out.printf("Intervalo [25.50]");
        }
        else if (numero >= 50 && numero <=75) {
            System.out.printf("Intervalo [50.75]");
        }
        else if (numero >= 75 && numero <=100) {
            System.out.printf("Intervalo [75.100]");
        }

        scanner.close();
    }
}
