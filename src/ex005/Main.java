package ex005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String produto1 = sc.nextLine();
        String produto2 = sc.nextLine();

        String[] produto1Array = produto1.split(" ");
        String[] produto2Array = produto2.split(" ");

        int codigo1 = Integer.parseInt(produto1Array[0]);
        int quantidade1 = Integer.parseInt(produto1Array[1]);
        double valor1 = Double.parseDouble(produto1Array[2]);
        int codigo2 = Integer.parseInt(produto2Array[0]);
        int quantidade2 = Integer.parseInt(produto2Array[1]);
        double valor2 = Double.parseDouble(produto2Array[2]);

        double total = (quantidade1 * valor1) + (quantidade2 * valor2);
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));
    }
}
