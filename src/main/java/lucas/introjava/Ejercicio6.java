package lucas.introjava;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero a operar");
        double numero = scan.nextDouble();
        double doble = numero * 2;
        double triple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("El doble de " + numero + " es: " + doble);
        System.out.println("El triple de " + numero + " es: " + triple);
        System.out.println("La raiz cuadrada de " + numero + " es: " + raizCuadrada);
        scan.close();
    }
}