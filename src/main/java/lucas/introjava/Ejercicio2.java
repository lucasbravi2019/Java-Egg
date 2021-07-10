package lucas.introjava;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        double numero1 = leer.nextDouble();
        System.out.println("Ingresa el segundo numero");
        double numero2 = leer.nextDouble();
        double suma = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
    }
}