package Exercicio15;

public class Vehicle {
    private double price;
    private int fuelType;
    private double finalPrice;

    // price
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // fuelType
    public int getFuelType() {
        return this.fuelType;
    }
    public void setFuelType(int fuelType) {
        this.fuelType = fuelType;
    }
    public Vehicle(double price, int fuelType){
        this.price = price;
        this.fuelType = fuelType;
    }

    // finalPrice
    public double getFinalPrice() {
        return this.finalPrice;
    }
    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }
}
