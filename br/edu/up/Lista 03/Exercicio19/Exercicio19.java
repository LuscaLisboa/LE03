package Exercicio19;

import java.util.Scanner;

public class Exercicio19 {
    public void executar() {

        Scanner leitor = new Scanner(System.in);

        Triangulo triangulo = new Triangulo();

        System.out.println("Informe o 1° lado do triângulo: ");
        triangulo.setLado1(leitor.nextInt());
        System.out.println("Informe o 2° lado do triângulo: ");
        triangulo.setLado2(leitor.nextInt());
        System.out.println("Informe o 3° lado do triângulo: ");
        triangulo.setLado3(leitor.nextInt());

        

        leitor.close();
    }
}
