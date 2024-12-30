package ex003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;

        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        c = Integer.parseInt(sc.nextLine());
        d = Integer.parseInt(sc.nextLine());

        int diff = (a * b) - (c * d);

        System.out.println("DIFERENCA = " + diff);
    }
}
