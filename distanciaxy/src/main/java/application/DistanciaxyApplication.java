package application;

import entities.Triangle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DistanciaxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistanciaxyApplication.class, args);

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        //double xA, xB, xC, yA, yB, yC;
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = x.area();

        System.out.printf("Triangle X area: %.4f %n", areaX);
        System.out.printf("Triangle Y area: %.4f %n", areaY);

        if(areaX > areaY){
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
