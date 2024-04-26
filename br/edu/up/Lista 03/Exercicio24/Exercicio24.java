package Exercicio24;
import java.util.Scanner;

public void exercicio24(){
    Scanner leitor = new Scanner(System.in);
    EstudanteDois estudantedois = new EstudanteDois();

    System.out.print("Informe a nota do trabalho de laboratório (0 a 10): ");
    double notaLab = leitor.nextDouble();
    System.out.print("Informe a nota da avaliação semestral (0 a 10): ");
    double notaAvaliacaoSemestral = leitor.nextDouble();
    System.out.print("Informe a nota do exame final (0 a 10): ");
    double notaExameFinal = leitor.nextDouble();

    if (notaLab < 0 || notaLab > 10 ||
        notaAvaliacaoSemestral < 0 || notaAvaliacaoSemestral > 10 ||
        notaExameFinal < 0 || notaExameFinal > 10) {
        System.out.println("As notas devem estar no intervalo de 0 a 10.");
        leitor.close();
        return;
    }

    double pesoLaboratorio = 2;
    double pesoAvaliacaoSemestral = 3;
    double pesoExameFinal = 5;
    double notaFinal = (notaLab * pesoLaboratorio +
                       notaAvaliacaoSemestral * pesoAvaliacaoSemestral +
                       notaExameFinal * pesoExameFinal) / (pesoLaboratorio + pesoAvaliacaoSemestral + pesoExameFinal);

    System.out.println("A nota final do estudante é: " + notaFinal);

    leitor.close();
}

