package Exercicio09;

public class Numbers {

    private double[] numbers;

    public void initializeNumbers(int qnt){
        numbers = new double[qnt];
    }

    public void setNumbers(int index, double number){
        numbers[index] = number;
    }
    public double getNumbers(int index){
        return numbers[index];
    }
}
