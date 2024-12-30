package exPessoal;

import exPessoal.MathOperations.Operations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations opr = new Operations();
        int valorA;
        int valorB;
        System.out.print("Digite um Inteiro :");
        valorA = Integer.parseInt(sc.nextLine());
        System.out.print("Digite outro Inteiro :");
        valorB = Integer.parseInt(sc.nextLine());

        System.out.println("O Resultado final da soma é :" + opr.Soma(valorA, valorB));
        System.out.println("O Resultado final da subtração é :" + opr.Subtracao(valorA, valorB));
        System.out.println("O Resultado final da multiplicação é :" + opr.Multiplicacao(valorA, valorB));
    }
}