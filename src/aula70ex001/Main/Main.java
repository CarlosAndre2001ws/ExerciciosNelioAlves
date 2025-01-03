package aula70ex001.Main;

import aula70ex001.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double width;
        double height;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");

        while(true) {
            try {
                width = Double.parseDouble(sc.nextLine());
                height = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException ignore) {
                System.out.println("Please enter a valid number");
            }
        }

        Rectangle rec = new Rectangle(width, height);

        System.out.println("AREA      = " + rec.area());
        System.out.println("PERIMETER = " + rec.perimeter());
        System.out.println("DIAGONAL  = " + rec.diagonal());
    }
}
