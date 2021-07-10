package lucas.introjava;

import java.util.Scanner;

public class Ejercicio23E {
    public static void main(String[] args) {
        int n, m, numero, fibonacci;
        String fibo = "";
        // n - 1 = n
        // n - 2 = m
        Scanner scan = new Scanner(System.in);
        n = 1;
        m = 1;
        System.out.println("Ingrese hasta donde quiere imprimir");
        numero = scan.nextInt();
        for (int i = 0; i < numero; i++) {
            if (i == 0) {
                n = 1;
                m = 0;
                fibonacci = n + m;
                m = n;
                n = fibonacci;
            } else {
                fibonacci = n + m;
                m = n;
                n = fibonacci;
            }
            if (i < (numero - 1)) {
                fibo += Integer.toString(fibonacci) + " + ";
            } else {
                fibo += Integer.toString(fibonacci);
            }
        }
        System.out.println("Fibonacci:");
        System.out.println(fibo);
    }
}
