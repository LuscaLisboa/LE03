package Exercicio17;
import java.util.Scanner;

public class Exercicio17 {
    public void executar(){
        Scanner leitor = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        
        System.out.print("Informe o nome do funcionário: ");
        String nomeFuncionario = leitor.nextLine();
        System.out.print("Informe o salário do funcionário em reais: ");
        double salario = leitor.nextDouble();
        System.out.print("Informe o valor do salário mínimo em reais: ");
        double salarioMinimo = leitor.nextDouble();

        double novoSalario = salario * (1 + 0.1);
        double reajuste = novoSalario - salario;

        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Reajuste: R$" + reajuste);
        System.out.println("Novo salário  do funcionario: R$" + novoSalario);
        double aumentoFolha = novoSalario - salario;
        System.out.println("Aumento na folha de pagamento da empresa: R$" + aumentoFolha);

        leitor.close();
    }
}
