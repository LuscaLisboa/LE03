package Exercicio24;

public class EstudanteDois{
    private double notaLab;
    private double notaSemestral;
    private double exameFinal;

    public EstudanteDois() {
    }

    public EstudanteDois(double notaLab, double notaSemestral, double exameFinal) {
        this.notaLab = notaLab;
        this.notaSemestral = notaSemestral;
        this.exameFinal = exameFinal;
    }
    
    public double getNotaLaboratorio() {
        return this.notaLab;
    }

    public void setNotaLaboratorio(double notaLab) {
        this.notaLab = notaLab;
    }

    public double getNotaSemestral() {
        return this.notaSemestral;
    }

    public void setNotaSemestral(double notaSemestral) {
        this.notaSemestral = notaSemestral;
    }

    public double getExameFinal() {
        return this.exameFinal;
    }

    public void setExameFinal(double exameFinal) {
        this.exameFinal = exameFinal;
    }


}
