package Exercicio04;

public class User {

    private String name;
    private double qnt; //
    private double price; //

    // Name
    public void setName(String sName){
        name = sName;
    }
    public String getName(){
        return name;
    }

    // Quantity
    public void setQuantity(double sQnt){
        qnt = sQnt;
    }
    public double getQuantity(){
        return qnt;
    }

    // Price
    public void setPrice(double sPrice){
        price = sPrice;
    }
    public double getPrice(){
        return price;
    }

    public double conversion(){
        return qnt * price;
    }
}
