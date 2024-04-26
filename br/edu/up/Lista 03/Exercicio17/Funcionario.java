package Exercicio17;

public class Funcionario {
    public String nomeFuncionario;
    public double salario;
    public double salarioMinimo;

    // public Funcionario(String nomeFuncionario, double salario, double salarioMinimo) {
    //     this.nomeFuncionario = nomeFuncionario;
    //     this.salario = salario;
    //     this.salarioMinimo = salarioMinimo;
    // }

    public String getNomeFuncionario() {
        return this.nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioMinimo() {
        return this.salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }
    
    
}
