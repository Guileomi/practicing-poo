package repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        char resposta;
        do{
            System.out.println("Digite a temperatura em Celcius:");
            double c = scanner.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente  em Fehrenheit: %.1f %n", f);
            System.out.println("Deseja continuar (S/N)?");
            resposta = scanner.next().charAt(0);
        } while (resposta != 'n');

        scanner.close();
    }
}
