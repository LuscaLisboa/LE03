package Exercicio09;

import java.util.Scanner;

public class Exercicio09 {
    public static void execute(){

        Scanner read = new Scanner(System.in);

        Numbers numeros = new Numbers();

        int qnt = 80;
        numeros.initializeNumbers(qnt);

        for(int i = 0; i < qnt; i++){
            System.out.println("Informe o " + (i+1) + "° número: ");
            numeros.setNumbers(i, read.nextDouble());
        }
        System.out.println("Números entre 10 e 150: ");
        for(int i = 0; i < qnt; i++){
            if(numeros.getNumbers(i) >= 10 && numeros.getNumbers(i) <= 150) System.out.println(numeros.getNumbers(i));
        }

        read.close();
    }
}
