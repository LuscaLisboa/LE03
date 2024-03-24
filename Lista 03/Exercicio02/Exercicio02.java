package Exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void execute(){

        Scanner read = new Scanner(System.in);

        Automovel automovel = new Automovel() ;

        System.out.println("Informe a distãncia: ");
        automovel.setDist(read.nextDouble());

        System.out.println("Informe o combustível gasto? ");
        automovel.setComb(read.nextDouble());

        System.out.println("Distância: " + automovel.getDist());
        System.out.println("Combustível gasto: " + automovel.getComb());
        System.out.println("Consumo médio: " + automovel.consumoMedio() + " km/L");

        read.close();
    }
}
