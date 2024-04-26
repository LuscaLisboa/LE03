package Exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void execute(){

        Scanner read = new Scanner(System.in);

        int qnt = 5;
        Persons[] pessoa = new Persons[qnt];

        for(int i = 0; i < qnt; i++){
            pessoa[i] = new Persons();
            System.out.println("Informe a idade da " + (i+1) + "° pessoa: ");
            pessoa[i].setAge(read.nextInt());
        }
        for(int i = 0; i < qnt; i++){
            if(pessoa[i].getAge() < 18) System.out.println("A " + (i+1) + "° pessoa é MENOR de idade: " + pessoa[i].getAge());
            if(pessoa[i].getAge() >= 18) System.out.println("A " + (i+1) + "° pessoa é MAIOR de idade: " + pessoa[i].getAge());
        }

        read.close();
    }
}
