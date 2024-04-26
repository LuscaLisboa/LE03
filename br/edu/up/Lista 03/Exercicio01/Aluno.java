package Exercicio01;

public class Aluno {

    public String nome;
    public double[] notas; // (index, valor)

    public void inicializarNotas(int qnt) {
        notas = new double[qnt];
    }

    // nome
    public void setNome(String sNome) {
        nome = sNome;
    }
    public String getNome() {
        return nome;
    }

    // notas
    public void setNota(int index, double sNotas) {
        notas[index] = sNotas;
    }
    public double getNota(int index) {
        return notas[index];
    }

    public  double calcularMediaArit(int qnt) {
        double mediaArit = 0;
        for(int i = 0; i < qnt; i++) {
            mediaArit += notas[i];
        }
        return mediaArit / qnt;
    }
}