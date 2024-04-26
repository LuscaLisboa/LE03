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

        double pesoIdeal;
        if (pessoa.sexo == 'M' || pessoa.sexo == 'm') {
            if (pessoa.altura > 1.70) {
                if (idade <= 20)
                    pesoIdeal = (72.7 * pessoa.altura) - 58;
                else if (idade >= 21 && idade <= 39)
                    pesoIdeal = (72.7 * pessoa.altura) - 53;
                else
                    pesoIdeal = (72.7 * pessoa.altura) - 45;
            } else {
                if (idade <= 40)
                    pesoIdeal = (72.7 * pessoa.altura) - 50;
                else
                    pesoIdeal = (72.7 * pessoa.altura) - 58;
            }
        } else if (pessoa.sexo == 'F' || pessoa.sexo == 'f') {
            if (pessoa.altura > 1.50) {
                if (idade >= 35)
                    pesoIdeal = (62.1 * pessoa.altura) - 45;
                else
                    pesoIdeal = (62.1 * pessoa.altura) - 49;
            } else {
                pesoIdeal = (62.1 * pessoa.altura) - 44.7;
            }
        } else {
            System.out.println("Sexo inválido, utilize M ou F.");
            leitor.close();
            return;
        }

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Peso Ideal: " + pesoIdeal + " kg");

        leitor.close();
    }
}
