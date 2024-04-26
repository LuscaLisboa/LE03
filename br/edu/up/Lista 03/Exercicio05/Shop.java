package Exercicio05;

public class Shop {

    private String name;
    private int installment;

    public Shop(String sName, int sInstallment){
        name = sName;
        installment = sInstallment;
    }

    // Name
    public void setName(String sName){
        name = sName;
    }
    public String getName(){
        return name;
    }

    // Installment
    public void setInstallment(int sInstallment){
        installment = sInstallment;
    }
    public int getInstallment(){
        return installment;
    }

    public double calculateInstallment(double value){
        return value / installment;
    }
}
