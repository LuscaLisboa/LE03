package Exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void execute(){

        Scanner read = new Scanner(System.in);

        double taxes = 45,
               distributorPercentage = 28;

        Car carro = new Car(taxes, distributorPercentage);

        System.out.println("Informe o custo de fábrica: ");
        carro.setFactoryCost(read.nextDouble());

        System.out.println("Custo de fábrica: R$" + carro.getFactoryCost());
        System.out.println("Imposto: " + taxes + "%");
        System.out.println("Porcentagem do distribuidor: " + distributorPercentage + "%");
        System.out.println("Preço final: R$" + carro.finalPrice());

        read.close();
    }
}
