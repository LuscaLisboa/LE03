package Exercicio11;

public class Persons {

    private String[] name;
    private char[] gender;

    public void initializeName(int qnt){
        name = new String[qnt];
    }
    public void initializeGender(int qnt){
        gender = new char[qnt];
    }

    // Name
    public void setName(int index, String sName){
        name[index] = sName;
    }
    public String getName(int index){
        return name[index];
    }

    // Gender
    public void setGender(int index, char sGender){
        sGender = Character.toUpperCase(sGender);
        gender[index] = sGender;
    }
    public char getGender(int index){
        return gender[index];
    }
}
