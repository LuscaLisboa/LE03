package Exercicio10;

public class Persons {

    private int[] age;

    public void initializeAge(int qnt){
        age = new int[qnt];
    }

    // Age
    public void setAge(int index, int sAge){
        age[index] = sAge;
    }
    public int getAge(int index){
        return age[index];
    }
}
