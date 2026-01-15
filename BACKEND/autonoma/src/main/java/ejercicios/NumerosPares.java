package ejercicios;

import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        //Entrada
        int inicio;
        int fin;

        System.out.println("Ingresar Numero de Inicio: ");
        inicio = Entrada.nextInt();

        System.out.println("Ingresar Numero Fin: ");
        fin = Entrada.nextInt();

        System.out.println("Rango de numeros Par: " + inicio + ", " + fin);

        if (inicio > fin) {
            int temp = inicio;
            inicio = fin;
            fin = temp;
        }

        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
