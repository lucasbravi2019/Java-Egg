package lucas.introjava;

import java.util.Scanner;

public class Ejercicio16E {
    public static boolean esPrimo(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador += 1;
            }
        }
        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero");
        numero = scan.nextInt();
        scan.close();
        if (esPrimo(numero)) {
            System.out.println("El numero " + numero + " es primo");
        } else {
            System.out.println("El numero " + numero + " no es primo");
        }
    }
}
