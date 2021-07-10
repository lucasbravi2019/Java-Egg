package lucas.introjava;

import java.util.Scanner;

public class Ejercicio17E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que agregara");
        int n = scan.nextInt();
        int suma = 0;
        var vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero a agregar");
            vector[i] = scan.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma es: " + suma);
        scan.close();
    }
}
