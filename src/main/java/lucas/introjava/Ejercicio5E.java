package lucas.introjava;

import java.util.Scanner;

public class Ejercicio5E {
    public static void main(String[] args) {
        Character obraSocial;
        double precioTratamiento;
        double precioTotal;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese A, B, o C segun el tipo de obra social");
        obraSocial = scan.next().toUpperCase().charAt(0);
        if (obraSocial.equals('A') || obraSocial.equals('B') || obraSocial.equals('C')) {
            System.out.println("Ingrese el precio del tratamiento");
            precioTratamiento = scan.nextDouble();
            if (obraSocial.equals('A')) {
                precioTotal = precioTratamiento * .5;
                System.out.println("El precio del tratamiento sera: " + precioTotal);
            } else if (obraSocial.equals('B')) {
                precioTotal = precioTratamiento * .65;
                System.out.println("El precio del tratamiento sera: " + precioTotal);
            } else if (obraSocial.equals('C')) {
                precioTotal = precioTratamiento;
                System.out.println("El precio del tratamiento sera: " + precioTotal);
            }
        } else {
            System.out.println("Ingreso un tipo de obra social invalido");
        }
        scan.close();
    }
}