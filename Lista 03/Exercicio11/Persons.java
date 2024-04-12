package Exercicio11;

public class Persons {

    private String name;
    private char gender;

    // Name
    public void setName(String sName){
        this.name = sName;
    }
    public String getName(){
        return this.name;
    }

    // Gender
    public void setGender(char sGender){
        sGender = Character.toUpperCase(sGender);
        this.gender = sGender;
    }
    public char getGender(){
        return this.gender;
    }
}
