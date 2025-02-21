package ejercicios;

public class areadeuncirculo {

    public static void main(String[] args) {

        double area;
        double radio = 5;
        
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("el area de un circulo que tiene un radio de " + radio +  " es: " + area);
    }
}

