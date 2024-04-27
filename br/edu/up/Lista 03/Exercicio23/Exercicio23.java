package Exercicio23;

import java.util.Scanner;

public class Exercicio23 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.print("Informe o nome da pessoa: ");
        pessoa.setNome(leitor.nextLine());
        System.out.print("Informe o sexo da pessoa (M/F): ");
        pessoa.setSexo(leitor.next().charAt(0));
        System.out.print("Informe a altura da pessoa em metros: ");
        pessoa.setAltura(leitor.nextDouble());
        System.out.print("Informe a idade da pessoa: ");
        pessoa.setIdade(leitor.nextInt());

        double pesoIdeal;
        if (pessoa.getSexo() == 'M' || pessoa.getSexo() == 'm') {
            if (pessoa.getAltura() > 1.70) {
                if (pessoa.getIdade() <= 20)
                    pesoIdeal = (72.7 * pessoa.getAltura()) - 58;
                else if (pessoa.getIdade() >= 21 && pessoa.getIdade() <= 39)
                    pesoIdeal = (72.7 * pessoa.getAltura()) - 53;
                else
                    pesoIdeal = (72.7 * pessoa.getAltura()) - 45;
            } else {
                if (pessoa.getIdade() <= 40)
                    pesoIdeal = (72.7 * pessoa.getAltura()) - 50;
                else
                    pesoIdeal = (72.7 * pessoa.getAltura()) - 58;
            }
        } else if (pessoa.getSexo() == 'F' || pessoa.getSexo() == 'f') {
            if (pessoa.getAltura() > 1.50) {
                if (pessoa.getIdade() >= 35)
                    pesoIdeal = (62.1 * pessoa.getAltura()) - 45;
                else
                    pesoIdeal = (62.1 * pessoa.getAltura()) - 49;
            } else {
                pesoIdeal = (62.1 * pessoa.getAltura()) - 44.7;
            }
        } else {
            System.out.println("Sexo inválido, utilize M ou F.");
            leitor.close();
            return;
        }

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Peso Ideal: " + pesoIdeal + " kg");

        leitor.close();
    }
}
