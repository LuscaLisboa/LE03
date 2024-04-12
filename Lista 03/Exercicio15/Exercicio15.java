package Exercicio15;

import java.util.Scanner;

public class Exercicio15 {
    public static void execute(){

        Scanner read = new Scanner(System.in);

        double price,
               total = 0;
        int type;

        while(true){
            
            System.out.println("Informe o valor do veículo: [0 - encerra o programa]");
            price = read.nextDouble();
            if(price == 0 ) break;

            System.out.println("Informe o tipo de combustível utilizado: ");
            System.out.println("[1] Alcool");
            System.out.println("[2] Gasolina");
            System.out.println("[3] Diesel");
            type = read.nextInt();
            if(type == 0) break;

            Vehicle veiculo = new Vehicle(price, type);

            switch (veiculo.getFuelType()) {

                case 1:
                    price -= veiculo.getPrice() * 25 / 100;
                    total += price;
                    veiculo.setFinalPrice(price);
                    System.out.println("Valor com desconto: " + veiculo.getFinalPrice());
                    break;

                case 2:
                    price -= veiculo.getPrice() * 21 / 100;
                    total += price;
                    veiculo.setFinalPrice(price);
                    System.out.println("Valor com desconto: " + veiculo.getFinalPrice());
                    break;

                case 3:
                    price -= veiculo.getPrice() * 14 / 100;
                    total += price;
                    veiculo.setFinalPrice(price);
                    System.out.println("Valor com desconto: " + veiculo.getFinalPrice());
                    break;
            
                default:
                    break;
            }
        }

        System.out.println("Total pago pelos clientes: " + total);

        read.close();

    }
}
