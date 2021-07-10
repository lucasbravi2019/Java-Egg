package lucas.introjava;

import java.util.Scanner;

public class Ejercicio12E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pisos;
        System.out.println("Ingrese el numero de pisos de la escalera");
        pisos = scan.nextInt();
        for (int i = 0; i < pisos; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println("");
        }
    }
}