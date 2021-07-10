package lucas.introjava;

import java.util.Scanner;

public class Ejercicio7E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese n");
        int n = scan.nextInt();
        int contador = 0;
        int numero;
        int maximo = 0;
        int minimo = 0;
        int positivos = 0;
        int suma = 0;
        // Version While
        while (contador < n) {
            System.out.println("Ingrese un numero");
            numero = scan.nextInt();
            if (maximo == 0 && minimo == 0) {
                maximo = numero;
                minimo = numero;
            }
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
            if (numero > 0) {
                suma += numero;
                positivos += 1;
            }
            contador += 1;
        }
        System.out.println("El numero maximo fue: " + maximo);
        System.out.println("El numero minimo fue: " + minimo);
        System.out.println("El promedio fue: " + suma / positivos);
        // Version Do - While
        maximo = 0;
        minimo = 0;
        suma = 0;
        positivos = 0;
        contador = 0;
        do {
            System.out.println("Ingrese un numero");
            numero = scan.nextInt();
            if (maximo == 0 && minimo == 0) {
                maximo = numero;
                minimo = numero;
            }
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
            if (numero > 0) {
                suma += numero;
                positivos += 1;
            }
            contador += 1;

        } while (contador < n);
        System.out.println("El numero maximo fue: " + maximo);
        System.out.println("El numero minimo fue: " + minimo);
        System.out.println("El promedio fue: " + suma / positivos);
    }
}