package ex001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, result;
        boolean input = true;

        Scanner sc = new Scanner(System.in);

        while (input) {
            a = Integer.parseInt(sc.nextLine());
            b = Integer.parseInt(sc.nextLine());

            result = a + b;
            System.out.println("SOMA = " + result);
            System.out.println("Você deseja continuar? (S/N)");
            input = sc.nextLine().equalsIgnoreCase("S");
        }
    }
}
