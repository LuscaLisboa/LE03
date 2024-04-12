package Exercicio14;

import java.util.Scanner;

public class Exercicio14 {
    public static void execute(){

        Scanner read = new Scanner(System.in);

        int qnt = 5;
        Product[] produto = new Product[qnt];
        
        for(int i = 0; i < qnt; i++) {
            
            produto[i] = new Product();
            
            System.out.println("Informe o preço de custo do "+(i+1)+"° produto: ");
            produto[i].setCostPrice(read.nextDouble());
            
            System.out.println("Informe o preço de venda do "+(i+1)+"° produto: ");
            produto[i].setSalePrice(read.nextDouble());
        }
        
        System.out.printf("\n");
        
        double medCusto = 0,
               medVenda = 0;

        for(int i = 0; i < qnt; i++) {
            
            medCusto += produto[i].getCostPrice();
            medVenda += produto[i].getSalePrice();

            System.out.println((i+1)+"° produto - Custo: " + produto[i].getCostPrice() + " | Venda: " + produto[i].getSalePrice());
            if(produto[i].getCostPrice() < produto[i].getSalePrice()) System.out.println("Houve lucro!");
            if(produto[i].getCostPrice() > produto[i].getSalePrice()) System.out.println("Houve prejuízo!");
            System.out.printf("\n");
        }

        System.out.println("Média de preço de custo: " + medCusto/qnt);
        System.out.println("Média de preço de venda: " + medVenda/qnt);
        
        read.close();
    }
}

