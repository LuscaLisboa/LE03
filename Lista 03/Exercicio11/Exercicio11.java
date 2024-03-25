package Exercicio11;

import java.util.Scanner;


public class Exercicio11 {
    public static void execute(){

        Scanner read = new Scanner(System.in);

        Persons pessoa = new Persons();

        int qnt = 5;
        pessoa.initializeName(qnt);
        pessoa.initializeGender(qnt);

        for(int i = 0; i < qnt; i++) {
            System.out.println("Informe o nome da " + (i+1) + "° pessoa: ");
            pessoa.setName(i, read.nextLine());

            System.out.println("Informe o sexo da " + (i+1) + "° pessoa [M ou F]: ");
            pessoa.setGender(i, read.nextLine().charAt(0));
        }

        int sumM = 0;
        int sumF = 0;
        for(int i = 0; i < qnt; i++) {
            if(pessoa.getGender(i) == 'M') {
                System.out.println("Nome: " + pessoa.getName(i) + " - Sexo: " + pessoa.getGender(i));
                sumM++;
            }
            if(pessoa.getGender(i) == 'F') {
                System.out.println("Nome: " + pessoa.getName(i) + " - Sexo: " + pessoa.getGender(i));
                sumF++;
            }
        }
        System.out.println("Total de homens: " + sumM);
        System.out.println("Total de mulheres: " + sumF);

        read.close();
    }
}
