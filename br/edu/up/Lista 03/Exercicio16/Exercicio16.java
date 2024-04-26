package Exercicio16;

import java.util.Scanner;

public class Exercicio16 {
    public static void execute(){

        Scanner read = new Scanner(System.in);

        double minWage = 1412, // recente
                wage;
        int qnt = 584;

        Employee funcionario = new Employee();

        for(int i = 0; i < qnt; i++) {
            System.out.println("Informe o salário do funcionário: ");
            funcionario.setWage(read.nextDouble());
            
            wage = funcionario.getWage();

            if(funcionario.getWage() < minWage * 3) {
                wage += funcionario.getWage() * 50 / 100;
                funcionario.setWage(wage);
                System.out.println("Salário reajustado: R$" + funcionario.getWage());
            }

            if(funcionario.getWage() >= minWage * 3 && funcionario.getWage() <= minWage * 10) {
                wage += funcionario.getWage() * 20 / 100;
                funcionario.setWage(wage);
                System.out.println("Salário reajustado: R$" + funcionario.getWage());
            }

            if(funcionario.getWage() > minWage * 10 && funcionario.getWage() <= minWage * 20) {
                wage += funcionario.getWage() * 15 / 100;
                funcionario.setWage(wage);
                System.out.println("Salário reajustado: R$" + funcionario.getWage());
            }

            if(funcionario.getWage() > minWage * 20) {
                wage += funcionario.getWage() * 10 / 100;
                funcionario.setWage(wage);
                System.out.println("Salário reajustado: R$" + funcionario.getWage());
            }
            
        }

        read.close();

    }
}
