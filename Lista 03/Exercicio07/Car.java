package Exercicio07;

public class Car {

    private double factoryCost;
    private double taxes;
    private double distributorPercentage;

    public Car(){

    }
    public Car(double sTaxes, double sDistributorPercentage){
        taxes = sTaxes;
        distributorPercentage = sDistributorPercentage;
    }

    // Factory Cost
    public void setFactoryCost(double sFactoryCost){
        factoryCost = sFactoryCost;
    }
    public double getFactoryCost(){
        return factoryCost;
    }

    public double finalPrice(){
        factoryCost += factoryCost * taxes / 100;
        return factoryCost + factoryCost * distributorPercentage / 100;
    }
}
