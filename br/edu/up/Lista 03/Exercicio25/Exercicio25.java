package Exercicio25;

import java.util.Scanner;

public class Exercicio25 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        EstudanteNome estudante = new EstudanteNome();

        System.out.print("Informe o nome do estudante: ");
        estudante.setNome(leitor.nextLine());

        System.out.print("Informe o número de matrícula do estudante: ");
        estudante.setMatricula(leitor.nextInt());

        System.out.print("Informe a nota do trabalho de laboratório: ");
        estudante.setNotaLaboratorio(leitor.nextDouble());

        System.out.print("Informe a nota da avaliação semestral: ");
        estudante.setNotaSemestral(leitor.nextDouble());

        System.out.print("Informe a nota do exame final: ");
        estudante.setExameFinal(leitor.nextDouble());

        if (estudante.getNotaLaboratorio() < 0 || estudante.getNotaLaboratorio() > 10 ||
                estudante.getNotaSemestral() < 0 || estudante.getNotaSemestral() > 10 ||
                estudante.getExameFinal() < 0 || estudante.getExameFinal() > 10) {
            System.out.println("As notas devem estar no intervalo de 0 a 10.");
            leitor.close();
            return;
        }

        double pesoLaboratorio = 2;
        double pesoAvaliacaoSemestral = 3;
        double pesoExameFinal = 5;
        double notaF = (estudante.getNotaLaboratorio() * pesoLaboratorio +
                estudante.getNotaSemestral() * pesoAvaliacaoSemestral +
                estudante.getExameFinal() * pesoExameFinal)
                / (pesoLaboratorio + pesoAvaliacaoSemestral + pesoExameFinal);

        String classe;
        if (notaF >= 8 && notaF <= 10) {
            classe = "A";
        } else if (notaF >= 7 && notaF < 8) {
            classe = "B";
        } else if (notaF >= 6 && notaF < 7) {
            classe = "C";
        } else if (notaF >= 5 && notaF < 6) {
            classe = "D";
        } else {
            classe = "R";
        }
        System.out.println("Nome do estudante: " + estudante.getNome());
        System.out.println("Número de matrícula: " + estudante.getMatricula());
        System.out.println("Nota final: " + notaF);
        System.out.println("Classificação: " + classe);
        leitor.close();
    }
}
