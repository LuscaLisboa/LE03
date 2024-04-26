package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void execute(){

        Scanner read = new Scanner(System.in);

        Vendor vendedor = new Vendor();

        System.out.println("Informe o nome do vendedor: ");
        vendedor.setName(read.nextLine());

        System.out.println("Informe o salário fixo: ");
        vendedor.setSalary(read.nextDouble());

        System.out.println("Informe as vendas: ");
        vendedor.setSales(read.nextDouble());

        System.out.println("Nome: " + vendedor.getName());
        System.out.println("Salário fixo: " + vendedor.getSalary());
        System.out.println("Vendas: " + vendedor.getSales());
        System.out.println("Salário final: " + vendedor.finalSalary());

        read.close();
    }
}
