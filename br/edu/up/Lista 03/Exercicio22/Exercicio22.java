package Exercicio22;
import java.util.Scanner;

public class Exercicio22 {
    public void executar(){
        Scanner leitor = new Scanner(System.in);
        ContaLuz cl = new ContaLuz();
        System.out.println("Digite seu tipo de cliente: 1-residencia - 2-comercio - 3-industria");
        int cliente = leitor.nextInt();

        System.out.println("Informe kwh:");
        double qtdKwh = leitor.nextDouble();

        double valorKWh;
        switch (cliente) {
            case 1:
                valorKWh = 0.60;
                break;
            case 2:
                valorKWh = 0.48;
                break;
            case 3:
                valorKWh = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido. Informe (1, 2 ou 3).");
                leitor.close();
                return;
        }

        double valorConta = qtdKwh * valorKWh;

        System.out.println("O valor da conta será: R$"+valorConta);

        leitor.close();
    }


}

