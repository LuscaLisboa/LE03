package Exercicio08;

public class Student {

    private String name;
    private double[] grades;

    public Student(){

    }
    public Student(String sName){
        name = sName;
    }

    public void initializeGrades(int qnt){
        grades = new double[qnt];
    }

    // Name
    public void setName(String sName){
        name = sName;
    }
    public String getName(){
        return name;
    }

    // Grade
    public void setGrade(int index, double sGrade){
        grades[index] = sGrade;
    }
    public double getGrade(int index){
        return grades[index];
    }

    public double calculateArithmetic(int qnt){
        double arithmeticAverage = 0;
        for(int i = 0; i < qnt; i++) {
            arithmeticAverage += grades[i];
        }
        return arithmeticAverage / qnt;
    }
}
