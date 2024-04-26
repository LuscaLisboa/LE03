package Exercicio12;

import java.util.Scanner;

public class Exercicio12 {
    public static void execute(){

        Scanner read = new Scanner(System.in);

        Dealer concessionaria = new Dealer("CARANGO VELHO");

        int qnt = 100; // MACETE ;-;
        concessionaria.initializePrice(qnt);
        concessionaria.initializeYear(qnt);

        char response = 'Y';
        int i = 0,
        sum12 = 0,
        sum7 = 0;

        while(response != 'N'){
            System.out.println("Informe o valor do carro: ");
            concessionaria.setPrice(i, read.nextDouble());

            System.out.println("Informe o ano do carro: ");
            concessionaria.setYear(i, read.nextInt());

            if(concessionaria.getYear(i) <= 2000) {
                concessionaria.setPrice(i, concessionaria.getPrice(i) - (concessionaria.getPrice(i) * 12 / 100));
                System.out.println("Valor com desconto: " + concessionaria.getPrice(i));
                sum12++;
            }
            if(concessionaria.getYear(i) > 2000) {
                concessionaria.setPrice(i, concessionaria.getPrice(i) - (concessionaria.getPrice(i) * 7 / 100));
                System.out.println("Valor com desconto: " + concessionaria.getPrice(i));
                sum7++;
            }

            System.out.println("Deseja continuar? [S]/[N] ");
            response = Character.toUpperCase(read.next().charAt(0));

            i++;
        }
        System.out.println("Total de carros até o ano 2000: " + sum12);
        System.out.println("Total de carros geral: " + (sum12 + sum7));

        read.close();
    }
}
