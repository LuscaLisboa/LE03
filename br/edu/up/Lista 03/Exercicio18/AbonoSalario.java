package Exercicio18;
public class AbonoSalario{
    private String nome;
    private int idade;
    private char sexo;
    private double salario;

    public AbonoSalario() {
    }

    // public Abono(String nome, int idade, char sexo, double salario) {
    //     this.nome = nome;
    //     this.idade = idade;
    //     this.sexo = sexo;
    //     this.salario = salario;
    // }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
