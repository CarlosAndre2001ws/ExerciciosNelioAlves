package ex004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int funcionarioNumero;
        double horasTrabalhadas, valorHora;

        funcionarioNumero = Integer.parseInt(sc.nextLine());
        valorHora         = Double.parseDouble(sc.nextLine());
        horasTrabalhadas  = Double.parseDouble(sc.nextLine());

        double salario = valorHora * horasTrabalhadas;

        System.out.println("NUMBER = " + funcionarioNumero);
        System.out.println("SALARY = U$ " + String.format("%.2f", salario));
    }
}
