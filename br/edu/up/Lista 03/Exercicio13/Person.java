package Exercicio13;

public class Person {

    private String name;
    private String gender;
    private int age;
    private int health;


    // Nome 
    public void setName(String sName){
        this.name = sName;
    }
    public String getName(){
        return this.name;
    }

    // Gender 
    public void setGender(String sGender){
        this.gender = sGender;
    }
    public String getGender(){
        return this.gender;
    }

    // Age
    public void setAge(int sAge){
        this.age = sAge;
    }
    public int getAge(){
        return this.age;
    }

    // Health
    public void setHealth(int sHealth){
        this.health = sHealth;
    }
    public int getHealth(){
        return this.health;
    }
}
