package Exercicio26;
import java.util.Scanner;

public class Exercicio26 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        Risco risco = new Risco();

        System.out.print("Informe o nome do pretendente: ");
         String nome = leitor.nextLine();
         System.out.print("Informe a idade do pretendente: ");
         int idade = leitor.nextInt();
         System.out.print("Informe o grupo de risco do pretendente: ");
         int Risco = leitor.nextInt();
 
         if (idade < 17 || idade > 70) {
             System.out.println("O pretendente não se enquadra na faixa etária: ");
             return;
         }
 
        int ctg;
        if (idade >= 17 && idade <= 20) {
            ctg = Risco;
        } else if (idade >= 21 && idade <= 24) {
            ctg = Risco + 1;
        } else if (idade >= 25 && idade <= 34) {
            ctg = Risco + 2;
        } else if (idade >= 35 && idade <= 64) {
             ctg = Risco + 3;
            } else {
             ctg = Risco + 6;
            }
 
         System.out.println("Nome do pretendente: " + nome);
         System.out.println("Idade do pretendente: " + idade);
         System.out.println("Grupo de risco do pretendente: " + Risco);
         System.out.println("categoria do pretendente: " + ctg);

        leitor.close();
    }
}