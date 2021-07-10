package lucas.introjava;

import java.util.Scanner;

public class Ejercicio3E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        Character letra = scan.next().toLowerCase().charAt(0);
        if (letra.equals('a') || letra.equals('e') || letra.equals('i') || letra.equals('o') || letra.equals('u')) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
        scan.close();
    }
}