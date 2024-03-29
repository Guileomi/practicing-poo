package org.construtor;

import entities.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class ConstrutorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConstrutorApplication.class, args);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        // Product product = new Product("TV", 900.00, 10);
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        //System.out.print("Quantity in stock: ");
        //int quantity = sc.nextInt();
        Product product = new Product(name, price);


        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();

        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        sc.close();
    }

}
