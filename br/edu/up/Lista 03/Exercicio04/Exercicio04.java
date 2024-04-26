package Exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void execute(){

        Scanner read = new Scanner(System.in);

        User usuario = new User();

        System.out.println("Informe o nome do usuário: ");
        usuario.setName(read.nextLine());

        System.out.println("Informe o valor em dólar($): ");
        usuario.setQuantity(read.nextDouble());

        System.out.println("Informe o valor da cotação do dólar: ");
        usuario.setPrice(read.nextDouble());

        System.out.println("Usuário: " + usuario.getName());
        System.out.println("Valor: $" + usuario.getQuantity() + " | Conversão: " + usuario.getPrice());
        System.out.println("Valor: R$" + usuario.conversion());

        read.close();
    }
}
