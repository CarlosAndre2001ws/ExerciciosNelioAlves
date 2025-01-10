package exaula075.Main;

import exaula075.entities.CurrencyConversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double dollar, quantidadeCompra;
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        dollar = Double.parseDouble(sc.nextLine());
        System.out.print("How many dollars will be bought? ");
        quantidadeCompra = Double.parseDouble(sc.nextLine());
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConversion.valorFinal(dollar, quantidadeCompra));

    }
}
