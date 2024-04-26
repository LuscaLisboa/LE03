package Exercicio19;
import java.util.Scanner;

public class Exercicio19 {
    public void executar(){
        Scanner leitor = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();
        System.out.println("Informe três valores referentes aos lados de um triângulo: ");
        int lado1 = leitor.nextInt();
        int lado2 = leitor.nextInt();
        int lado3 = leitor.nextInt();

        if (triangulo.formaTriangulo(lado1, lado2, lado3)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo equilatero");
            }else if (lado1 == lado2 || lado1 == lado2 || lado2 == lado3) {
                System.out.println("Triangulo isosceles");
            }else{
                System.out.println("Triangulo escaleno");
            }
        }
        leitor.close();
    }
}
