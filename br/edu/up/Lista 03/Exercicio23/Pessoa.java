package Exercicio23;

public class Pessoa {
    private  String nome;
    private char sexo;
    private double altura;
    private int idade;

    public Pessoa() {
    }


    // public PesoIdeal(String nome, char sexo, double altura, int idade) {
    //     this.nome = nome;
    //     this.sexo = sexo;
    //     this.altura = altura;
    //     this.idade = idade;
    // }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
