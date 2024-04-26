package Exercicio13;

import java.util.Scanner;

public class Exercicio13 {
    public static void execute(){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe a quantidade de pessoas a serem informadas: ");
        int qnt = read.nextInt();
        read.nextLine();

        Person[] person = new Person[qnt];

        for(int i = 0; i < qnt; i++){
            person[i] = new Person();
            System.out.println("Informe o nome: ");
            person[i].setName(read.nextLine());

            System.out.println("Informe o sexo: ");
            person[i].setGender(read.nextLine());

            System.out.println("Informe a idade: ");
            person[i].setAge(read.nextInt());
            read.nextLine();

            System.out.println("Informe a qnt de vida: ");
            person[i].setHealth(read.nextInt());
            read.nextLine();
        }

        int S = 0, N = 0;
        for(int i = 0; i < qnt; i++){
            System.out.println((i+1) + "° pessoa: ");
            System.out.println(person[i].getName());
            System.out.println(person[i].getGender());
            System.out.println(person[i].getAge());
            System.out.println(person[i].getHealth());
            if(person[i].getHealth() > 50 && person[i].getAge() >= 18) {
                System.out.println("Está apta a cumprir serviço militar obrigatório."); 
                S++;
            }
            if(person[i].getHealth() < 50 && person[i].getAge() < 18) {
                System.out.println("Não está apta a cumprir serviço militar obrigatório."); 
                N++;
            }
        }
        System.out.println("Pessoas aptas: " + S);
        System.out.println("Pessoas não aptas: " + N);

        read.close();
    }
}
