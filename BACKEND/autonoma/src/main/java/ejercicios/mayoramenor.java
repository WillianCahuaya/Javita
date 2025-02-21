package ejercicios;

import java.util.Scanner;

public class mayoramenor {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduzca el primer numero: ");
            int num1 = sc.nextInt();
            System.out.print("Introduzca el segundo numero: ");
            int num2 = sc.nextInt();
            System.out.print("Introduzca el tercer numero: ");
            int num3 = sc.nextInt();

            int mayor = Math.max(num1, Math.max(num2, num3));
            int menor = Math.min(num1, Math.min(num2, num3));
            int medio = num1 + num2 + num3 - mayor - menor;

           
            System.out.println("Numeros ordenados de mayor a menor : " + mayor + ", " + medio + ", " + menor);

        }
    }
}
