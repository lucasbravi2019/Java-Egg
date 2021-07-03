package lucas.introjava;

import java.util.Scanner;

public class Ejercicio7 {
    public static void ejercicio7() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double numero1 = scan.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double numero2 = scan.nextDouble();
        scan.close();
        double maximo;
        if(numero1 > numero2) {
            maximo = numero1;
            System.out.println("El maximo es: " + maximo);
        }
        if(numero2 > numero1) {
            maximo = numero2;
            System.out.println("El maximo es: " + maximo);
        }
        if(numero1 == numero2) {
            System.out.println("Ambos numeros son iguales");
        }
    }
}