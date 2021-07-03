package lucas.introjava;

import java.util.Scanner;

public class Ejercicio2 {
    public static void ejercicio2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        double numero1 = scan.nextDouble();
        System.out.println("Ingresa el segundo numero");
        double numero2 = scan.nextDouble();
        double suma = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        scan.close();
    }
}