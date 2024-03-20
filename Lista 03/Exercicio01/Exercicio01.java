package Exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public void execute(){

        Scanner read = new Scanner(System.in);

        Aluno aluno01 = new Aluno();

        int qnt;
        
        System.out.println("Informe o nome do aluno: ");
        aluno01.setNome(read.nextLine());
        
        //System.out.println("Informe a quantidade de notas a serem inseridas: ");
        //qnt = read.nextInt();
        
        qnt = 3;
        aluno01.inicializarNotas(qnt);
        
        for(int i = 0; i < qnt; i++){
            System.out.println("Informe a " + (i+1) + "° nota do aluno " + aluno01.getNome() + ": ");
            aluno01.setNota(i, read.nextDouble());
        }
        for(int i = 0; i < qnt; i++){
            System.out.println((i+1) + "° nota do aluno " + aluno01.getNome() + ": " + aluno01.getNota(i));
        }
        System.out.println("Média aritmética: " + aluno01.calcularMediaArit(qnt));

        read.close();
    }
}
