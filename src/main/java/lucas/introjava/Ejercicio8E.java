package lucas.introjava;

import java.util.Scanner;

public class Ejercicio8E {
    public static void main(String[] args) {
        int numero, pares, impares, numeros;
        pares = 0;
        impares = 0;
        numeros = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero");
            numero = scan.nextInt();
            if (numero % 5 == 0) {
                break;
            }
            if (numero > 0) {
                numeros += 1;
                if (numero % 2 == 0) {
                    pares += 1;
                } else {
                    impares += 1;
                }
            }

        } while (numero > 0 && numero % 5 != 0);
        System.out.println("La cantidad de numeros leidos es de " + numeros);
        System.out.println("La cantidad de numeros pares es de " + pares);
        System.out.println("La cantidad de numeros impares es de " + impares);
        scan.close();
    }
}