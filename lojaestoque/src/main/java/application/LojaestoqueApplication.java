package application;

import entities.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class LojaestoqueApplication {

    public static void main(String[] args) {
        SpringApplication.run(LojaestoqueApplication.class, args);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data" + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int addQuantity = sc.nextInt();
        product.addProducts(addQuantity);

        System.out.println();
        System.out.println("Updated data " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        int removeQuantity = sc.nextInt();
        product.removeProducts(removeQuantity);

        System.out.println();
        System.out.println("Updated data " + product);

        sc.close();

    }
}
