package Exercicio19;

import java.util.Scanner;

public class Exercicio19 {
    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        Triangulo triangulo = new Triangulo();

        System.out.println("Informe o 1° lado do triângulo: ");
        triangulo.setLado1(leitor.nextInt());
        System.out.println("Informe o 2° lado do triângulo: ");
        triangulo.setLado2(leitor.nextInt());
        System.out.println("Informe o 3° lado do triângulo: ");
        triangulo.setLado3(leitor.nextInt());

        compararLados(triangulo);

        leitor.close();
    }

    public static void compararLados(Triangulo triangulo) {
        if (triangulo.getLado1() == triangulo.getLado2()) {
            if (triangulo.getLado1() == triangulo.getLado3()) {
                System.out.println("Triângulo equilátero.");
            }
        }
        if (triangulo.getLado1() == triangulo.getLado2()) {
            if (triangulo.getLado1() != triangulo.getLado3()) {
                System.out.println("Triângulo isósceles.");
            }
        }
        if (triangulo.getLado1() != triangulo.getLado2()) {
            if (triangulo.getLado1() == triangulo.getLado3()) {
                System.out.println("Triângulo isósceles.");
            }
        }
        if (triangulo.getLado1() != triangulo.getLado2() && triangulo.getLado1() != triangulo.getLado3()
                && triangulo.getLado2() != triangulo.getLado3()) {
            System.out.println("Triângulo escaleno.");
        }
    }
}
