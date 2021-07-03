package lucas.introjava;

import java.util.Scanner;

public class Ejercicio16 {
    public static void ejercicio16() {
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        double suma = 0;
        double numero;
        while(contador < 20) {
            contador += 1;
            System.out.println("Ingrese un numero");
            numero = scan.nextDouble();
            if(numero == 0) {
                System.out.println("Se capto el numero 0");
                break;
            } else {
                if(numero > 0) {
                    suma += numero;
                }
            }
        }
        System.out.println("La suma total es: " + suma);
    }
}