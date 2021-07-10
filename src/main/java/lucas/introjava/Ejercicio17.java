package lucas.introjava;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int correcto = 0;
        int incorrecto = 0;
        String secuencia = scan.nextLine();
        System.out.println(secuencia);
        while (!secuencia.equals("&&&&&")) {
            if (secuencia.length() != 5) {
                incorrecto += 1;
            } else {
                if (secuencia.substring(0, 1).equals("X")
                        && secuencia.substring(secuencia.length() - 1, secuencia.length()).equals("O")) {
                    correcto += 1;
                } else {
                    incorrecto += 1;
                }
            }
            System.out.println("Ingrese nuevamente la cadena. Ingrese &&&&& para finalizar");
            secuencia = scan.nextLine();
            System.out.println(secuencia);

        }
        if (secuencia.equals("&&&&&")) {
            System.out.println("La cantidad de veces que se leyo correctamente fue de: " + correcto + " veces");
            System.out.println("La cantidad de veces que se leyo incorrectamente fue de: " + incorrecto + " veces");
        }
    }
}
