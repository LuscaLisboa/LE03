package Exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void execute(){

        Scanner read = new Scanner(System.in);

        Persons pessoa = new Persons();

        int qnt = 5;
        pessoa.initializeAge(qnt);

        for(int i = 0; i < qnt; i++){
            System.out.println("Informe a idade da " + (i+1) + "° pessoa: ");
            pessoa.setAge(i, read.nextInt());
        }
        for(int i = 0; i < qnt; i++){
            if(pessoa.getAge(i) < 18) System.out.println("A " + (i+1) + "° pessoa é MENOR de idade: " + pessoa.getAge(i));
            if(pessoa.getAge(i) >= 18) System.out.println("A " + (i+1) + "° pessoa é MAIOR de idade: " + pessoa.getAge(i));
        }

        read.close();
    }
}
