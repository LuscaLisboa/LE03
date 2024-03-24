package Exercicio08;

import java.util.Scanner;

public class Exercicio08 {
    public static void execute(){

        Scanner read = new Scanner(System.in);

        Student aluno = new Student("Lucas");

        int qnt = 3;
        aluno.initializeGrades(qnt);

        for(int i = 0; i < qnt; i++) {
            System.out.println("Informe a " + (i + 1) + "° nota: ");
            aluno.setGrade(i, read.nextDouble());
        }

        System.out.println("Aluno: " + aluno.getName());
        for(int i = 0; i < qnt; i++) {
            System.out.println((i+1) + "° nota: " + aluno.getGrade(i));
        }
        System.out.println("Média aritmética: " + aluno.calculateArithmetic(qnt));

        read.close();
    }
}
