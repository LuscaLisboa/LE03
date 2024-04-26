package Exercicio25;
import java.util.Scanner;

public class Exercicio25{
    public void executar(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o nome do estudante: ");

        String nome = leitor.nextLine();
        System.out.print("Informe o número de matrícula do estudante: ");
        int matricula = leitor.nextInt();
        System.out.print("Informe a nota do trabalho de laboratório: ");
        double notaLaboratorio = leitor.nextDouble();
        System.out.print("Informe a nota da avaliação semestral: ");
        double notaAvaliacaoSemestral = leitor.nextDouble();
        System.out.print("Informe a nota do exame final: ");
        double notaExameFinal = leitor.nextDouble();
        EstudanteNome estudantenome= new EstudanteNome();
    
        if (notaLaboratorio < 0 || notaLaboratorio > 10 ||
            notaAvaliacaoSemestral < 0 || notaAvaliacaoSemestral > 10 ||
            notaExameFinal < 0 || notaExameFinal > 10) {
            System.out.println("As notas devem estar no intervalo de 0 a 10.");
            leitor.close();
            return;
        }

        double pesoLaboratorio = 2;
        double pesoAvaliacaoSemestral = 3;
        double pesoExameFinal = 5;
        double notaF = (notaLaboratorio * pesoLaboratorio +
                        notaAvaliacaoSemestral * pesoAvaliacaoSemestral +
                        notaExameFinal * pesoExameFinal) / (pesoLaboratorio + pesoAvaliacaoSemestral + pesoExameFinal);

        String class;
        if (notaF >= 8 && notaF <= 10) {
            class = "A";
        } else if (notaF >= 7 && notaF < 8) {
            class = "B";
        } else if (notaF >= 6 && notaF < 7) {
            class = "C";
        } else if (notaF >= 5 && notaF < 6) {
            class = "D";
        } else {
            class = "R";
        }
        System.out.println("Nome do estudante: " + nome);
        System.out.println("Número de matrícula: " + matricula);
        System.out.println("Nota final: " + notaF);
        System.out.println("Classificação: " + class);
        leitor.close();
    }
}
