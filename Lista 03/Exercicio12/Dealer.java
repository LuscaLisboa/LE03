package Exercicio12;

public class Dealer {

    private String name;
    private double[] price; 
    private int[] year; 

    public void initializePrice(int qnt){
        price = new double[qnt];
    }
    public void initializeYear(int qnt){
        year = new int[qnt];
    }

    public Dealer(String sName){
        name = sName;
    }

    // Name
    public void setName(String sName){
        name = sName;
    }
    public String getName(int index){
        return name;
    }

    // Price
    public void setPrice(int index, double sPrice){
        price[index] = sPrice;
    }
    public double getPrice(int index){
        return price[index];
    }

    // Year
    public void setYear(int index, int sYear){
        year[index] = sYear;
    }
    public int getYear(int index){
        return year[index];
    }
}
