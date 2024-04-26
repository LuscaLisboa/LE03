package Exercicio20;
import java.util.Scanner;

public class Exercicio20 {
    public void executar(){
        Scanner leitor = new Scanner(System.in);
        Aprender aprender = new Aprender();
        System.out.println("Informe seu nivel como professor:");
        int n = leitor.nextInt();

        double vHora = 0;
        switch (n) {
            case 1:
                vHora = 12.0;
                break;
            case 2:
                vHora = 17.0;
                break;
            case 3:
                vHora = 25.0;
                break;
            default:
                System.out.println("Nivel invalido");
                break;
        }
        System.out.println("Informe o número de horas de aula: ");
        int hAula = leitor.nextInt();
        double salario = vHora * hAula;
        System.out.println("Salário como professor: R$" + salario);
        leitor.close();
    }
}

