package lucas.introjava;

import java.util.Scanner;

public class Ejercicio9E {
    public static void main(String[] args) {
        int dividendo, divisor;
        double cociente, resto;
        cociente = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el dividendo");
        dividendo = scan.nextInt();
        System.out.println("Ingrese el divisor");
        divisor = scan.nextInt();
        resto = dividendo;
        while (resto >= divisor) {
            cociente += 1;
            resto -= divisor;
        }
        System.out.println("El cociente de la division entre " + dividendo + " y " + divisor + " es de " + cociente
                + " y su resto es de " + resto);
    }
}