package Exercicio21;
import java.util.Scanner;

public class Exercicio21 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Nadador nadador = new Nadador();
        System.out.println("Informe a idade do nadador: ");
        int idade = leitor.nextInt();

        String ctg;
            if (idade >= 5 && idade <= 7) {
            ctg = "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            ctg = "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            ctg = "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            ctg = "Juvenil B";
        } else if (idade >= 18 && idade <= 25) {
            ctg = "Senior";
            } else {
            ctg = "Idade fora da faixa etaria";
            }
        System.out.println("Categoria do nadador: " + ctg);
        leitor.close();
    }
    
}

