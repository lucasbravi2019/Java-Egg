package lucas.introjava;

import java.util.Scanner;

public class Ejercicio14 {
    public static void ejercicio14() {
        Scanner scan = new Scanner(System.in);
        double suma = 0;
        System.out.println("Ingrese el limite de la suma");
        double limite = scan.nextDouble();
        System.out.println("Ingrese un numero");
        double numero = scan.nextDouble();
        suma += numero;
        if(numero > limite) {
            while(numero > limite) {
                System.out.println("Por favor indique un numero menor al limite: " + limite);
                numero = scan.nextDouble();
            }
        } else {
            if(suma >= limite) {
                System.out.println("La suma es: " + suma);
            } else {
                while(suma < limite) {
                    System.out.println("Por favor indique otro numero");
                    numero = scan.nextDouble();
                    suma += numero;
                }
            }
        }
        System.out.println("La suma total es: " + suma);
        scan.close();
    }
}