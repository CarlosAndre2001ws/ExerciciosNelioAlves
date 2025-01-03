package Main;

import entities.Employee;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String name;
        double gross, tax;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Gross salary: ");
        gross = Double.parseDouble(sc.nextLine());
        System.out.print("Tax: ");
        tax = Double.parseDouble(sc.nextLine());
        System.out.println();

        Employee employee = new Employee(name, gross, tax);

        System.out.println("Employee: " + employee.netSalary());
        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        while(true) {
            try {
                employee.increaseSalary(Double.parseDouble(sc.nextLine()));
                break;
            } catch (NumberFormatException ignore) {
                System.out.println("Please Insert a Valid Number.");
            }
        }
        System.out.print("Updated data: " + employee.netSalary());


        sc.close();
    }
}
