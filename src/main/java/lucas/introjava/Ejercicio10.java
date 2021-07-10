package lucas.introjava;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = scan.nextLine();
        scan.close();
        if (palabra.length() == 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}