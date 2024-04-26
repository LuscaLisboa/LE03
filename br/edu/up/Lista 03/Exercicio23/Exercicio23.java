package Exercicio23;
import java.util.Scanner;

public class Exercicio23 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        System.out.print("Informe o nome da pessoa: ");
        pessoa.nome = leitor.nextLine();
        System.out.print("Informe o sexo da pessoa (M/F): ");
        pessoa.sexo = leitor.next().charAt(0);
        System.out.print("Informe a altura da pessoa em metros: ");
        pessoa.altura = leitor.nextDouble();
        System.out.print("Informe a idade da pessoa: ");

        int idade = leitor.nextInt();

        double Pessoa;
        if (sexo == 'M' || sexo == 'm') {
            if (altura > 1.70) {
                if (idade <= 20)
                    Pessoa = (72.7 * altura) - 58;
                else if (idade >= 21 && idade <= 39)
                    Pessoa = (72.7 * altura) - 53;
                else
                    Pessoa = (72.7 * altura) - 45;
            } else {
                if (idade <= 40)
                    Pessoa = (72.7 * altura) - 50;
                else
                    Pessoa = (72.7 * altura) - 58;
            }
        } else if (sexo == 'F' || sexo == 'f') {
            if (altura > 1.50) {
                if (idade >= 35)
                    Pessoa = (62.1 * altura) - 45;
                else
                    Pessoa = (62.1 * altura) - 49;
            } else {
                Pessoa = (62.1 * altura) - 44.7;
            }
        } else {
            System.out.println("Sexo inválido, utilize M ou F.");
            leitor.close();
            return;
        }

        System.out.println("Nome: " + nome);
        System.out.println("Peso Ideal: " + Pessoa + " kg");

        leitor.close();
    }
}

