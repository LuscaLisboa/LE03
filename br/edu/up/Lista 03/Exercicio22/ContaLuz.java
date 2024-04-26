package Exercicio22;

public class ContaLuz{
    private int cliente;
    private double qtdKwh;

    public ContaLuz(int cliente, double qtdKwh){
        this.cliente = cliente;
        this.qtdKwh = qtdKwh;
    }

    public int getCliente(){
        return cliente;
    }

    public double getQtdKwh(){
        return qtdKwh;
    }
    
    public ContaLuz() {
        
    }
}
