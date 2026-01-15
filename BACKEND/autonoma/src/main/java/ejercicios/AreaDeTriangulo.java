package ejercicios;

import java.util.Scanner;

public class AreaDeTriangulo {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        //Area del triagulo
        double base;
        double altura;

        double areaDeTriangulo;
        double areaDeCuadrado;

        System.out.println("Ingresar la base: ");
        base = Entrada.nextDouble();

        System.out.println("Ingresar la altura: ");
        altura = Entrada.nextDouble();

        //calculo de area
        areaDeTriangulo = (base * altura) / 2;

        areaDeCuadrado = base * altura;

        System.out.println("El area del Tringulo es: " + areaDeTriangulo);
        System.out.println("El area del cudrado es: " + areaDeCuadrado);

    }

}
