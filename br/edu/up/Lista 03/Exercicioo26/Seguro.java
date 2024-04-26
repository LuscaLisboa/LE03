package Exercicio26;

public class Seguro{
    public String nome;
    public int idade;
    public int Risco;

     public Seguro(String nome, int idade, int Risco) {
        this.nome = nome;
        this.idade = idade;
        this.Risco = Risco;
    }
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
    public int getRisco() {
        return this.Risco;
    }
    public void setRisco(int Risco) {
        this.Risco = Risco;
    }
}