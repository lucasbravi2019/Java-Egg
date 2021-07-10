package lucas.introjava;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase");
        String palabra = scan.nextLine();
        scan.close();
        String primerLetra = palabra.substring(0, 1);
        if (primerLetra.toUpperCase().equals("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}