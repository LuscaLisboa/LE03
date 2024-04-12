package Exercicio11;

import java.util.Scanner;

public class Exercicio11 {
    public static void execute(){

        Scanner read = new Scanner(System.in);

        int qnt = 5;
        Persons[] pessoa = new Persons[qnt];

        for(int i = 0; i < qnt; i++) {
            pessoa[i] = new Persons();
            System.out.println("Informe o nome da " + (i+1) + "° pessoa: ");
            pessoa[i].setName(read.nextLine());

            System.out.println("Informe o sexo da " + (i+1) + "° pessoa [M ou F]: ");
            pessoa[i].setGender(read.nextLine().charAt(0));
        }

        int sumM = 0;
        int sumF = 0;
        for(int i = 0; i < qnt; i++) {
            if(pessoa[i].getGender() == 'M') {
                System.out.println("Nome: " + pessoa[i].getName() + " - Sexo: " + pessoa[i].getGender());
                sumM++;
            }
            if(pessoa[i].getGender() == 'F') {
                System.out.println("Nome: " + pessoa[i].getName() + " - Sexo: " + pessoa[i].getGender());
                sumF++;
            }
        }
        System.out.println("Total de homens: " + sumM);
        System.out.println("Total de mulheres: " + sumF);

        read.close();
    }
}
