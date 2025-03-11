package ex_aula072.Main;

import ex_aula072.entities.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String nome;
        double nota1,nota2,nota3;
        Scanner sc = new Scanner(System.in);

        nome = sc.nextLine();
        nota1 = Double.parseDouble(sc.nextLine());
        nota2 = Double.parseDouble(sc.nextLine());
        nota3 = Double.parseDouble(sc.nextLine());

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
        aluno.finalGrade();

        sc.close();
    }
}
