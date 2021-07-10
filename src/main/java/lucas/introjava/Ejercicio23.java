package lucas.introjava;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        System.out.println("Ingrese la cantidad de numeros a generar");
        int n = scan.nextInt();
        System.out.println("Ingrese numero a buscar");
        int numero = scan.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) Math.floor(Math.random() * 10);
            if (vector[i] == numero) {
                contador += 1;
            }
        }
        String[] posiciones = new String[contador];
        contador = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] == numero) {
                posiciones[contador] = Integer.toString(i);
                contador += 1;
            }
        }
        System.out.println("Se repite " + contador + " veces");
        System.out.println(Arrays.toString(posiciones));
    }
}
