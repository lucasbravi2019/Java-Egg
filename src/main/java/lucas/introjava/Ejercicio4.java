package lucas.introjava;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase");
        String cadena = scan.nextLine();
        System.out.println("En minusculas: " + cadena.toLowerCase());
        System.out.println("En mayusculas: " + cadena.toUpperCase());
        scan.close();
    }
}