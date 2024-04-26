package Exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    public static void execute(){

        Scanner read = new Scanner(System.in);

        Product produto = new Product();

        System.out.println("Informe o custo do produto: ");
        produto.setPrice(read.nextDouble());

        System.out.println("Informe o percentual de acréscimo: ");
        double percentual = read.nextDouble();

        System.out.println("Custo: " + produto.getPrice());
        System.out.println("Percentual: " + percentual);
        System.out.println("Valor final: " + (produto.getPrice() + produto.getPrice() * percentual / 100));

        read.close();
    }
}
