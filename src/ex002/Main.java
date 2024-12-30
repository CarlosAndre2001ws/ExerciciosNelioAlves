package ex002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = Double.parseDouble(sc.nextLine());

        double result = Math.PI * Math.pow(r, 2);

        System.out.println("A=" + String.format("%.4f", result));
    }
}
