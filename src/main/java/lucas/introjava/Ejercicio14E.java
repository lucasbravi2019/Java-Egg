package lucas.introjava;

import java.util.Scanner;

public class Ejercicio14E {
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        double numero1, numero2, suma;
        int operacion;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numero1 = scan.nextDouble();
        System.out.println("Ingrese el segundo numero");
        numero2 = scan.nextDouble();
        System.out.println("Ingrese la operacion que desea realizar");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        operacion = scan.nextInt();
        if (operacion == 1) {
            System.out.println("La suma de los numeros es de " + sumar(numero1, numero2));
        }
        if (operacion == 2) {
            System.out.println("La resta de los numeros es de " + restar(numero1, numero2));
        }
        if (operacion == 3) {
            System.out.println("La multiplicacion de los numeros es de " + multiplicar(numero1, numero2));
        }
        if (operacion == 4) {
            System.out.println("La division de los numeros es de " + dividir(numero1, numero2));
        }
        if (operacion > 4 || operacion < 1) {
            System.out.println("Especifico una operacion invalida");
        }
    }
}
