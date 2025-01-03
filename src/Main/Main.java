package Main;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name;
        double price;
        int quantity;
        int newQuantity;

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Price: ");
        price = Double.parseDouble(sc.nextLine());
        System.out.print("Quantity in stock: ");
        quantity = Integer.parseInt(sc.nextLine());

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        newQuantity = Integer.parseInt(sc.nextLine());
        product.addProducts(newQuantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        newQuantity = Integer.parseInt(sc.nextLine());
        product.removeProducts(newQuantity);
        System.out.println();
        System.out.print("Updated data: " + product);

        sc.close();
    }
}