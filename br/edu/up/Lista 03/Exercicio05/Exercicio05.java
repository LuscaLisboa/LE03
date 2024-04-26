package Exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void execute(){

        Scanner read = new Scanner(System.in);

        Shop loja = new Shop("Loja Mamão com Açúcar", 5);

        System.out.println("Informe o valor da compra: ");
        double value = read.nextDouble();

        System.out.println(loja.getName());
        System.out.println("Quantidade de prestações: " + loja.getInstallment());
        System.out.println("Valor das prestações: " + loja.calculateInstallment(value));

        read.close();
    }
}
