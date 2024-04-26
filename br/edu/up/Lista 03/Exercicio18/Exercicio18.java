package Exercicio18;
import java.util.Scanner;

public class Exercicio18 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        Abono a = new Abono();

        System.out.println("Informe o nome do funcionario: ");
        String nome = leitor.nextLine();
        System.out.println("Informe a idade do funcionário: ");
        int idade = leitor.nextInt();
        System.out.println("Informe o sexo do funcionario:(M/F) ");
        char sexo = leitor.next().charAt(0);
        System.out.println("Informe o salario do funcionario em reais: ");
        double salario = leitor.nextDouble();
        double abono = 0;

        if (sexo == 'm' || sexo == 'M'){
            if (idade >= 30) {
                abono = 100;
            }else{
                abono = 50;
            }
            }else if (sexo == 'f' || sexo == 'F') {
                if (idade >= 30) {
                    abono = 200;
                }else{
                    abono = 80;
                }
            }else{
                System.out.println("sexo invalido!");
                System.exit(1);  
            }
            double salarioLiq = salario + abono;
            System.out.println("Funcionário: "+nome);
            System.out.println("Salário Liquido"+salarioLiq);
        leitor.close();
    }
}
