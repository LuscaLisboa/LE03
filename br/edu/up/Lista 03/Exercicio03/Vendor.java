package Exercicio03;

public class Vendor {

    private String name;
    private double salary;
    private double sales;

    // Name
    public void setName(String sName) {
        name = sName;
    }
    public String getName(){
        return name;
    }

    // Salary
    public void setSalary(double sSalary) {
        salary = sSalary;
    }
    public double getSalary() {
        return salary;
    }

    // Sales
    public void setSales(double sSales) {
        sales = sSales;
    }
    public double getSales() {
        return sales;
    }

    // Final salary
    public double finalSalary(){
        return salary + sales * 15 / 100;
    }
}
