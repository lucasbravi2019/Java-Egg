package lucas.introjava;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = scan.nextLine();
        System.out.println("Tu nombre es: " + nombre);
        scan.close();
    }
}
