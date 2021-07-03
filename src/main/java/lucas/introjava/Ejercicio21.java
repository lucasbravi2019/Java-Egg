package lucas.introjava;

import java.util.Scanner;

public class Ejercicio21 {
    public static void ejercicio21() {
        String moneda;
        double cantidadEurosAConvertir;
        double convertido = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir");
        cantidadEurosAConvertir = scan.nextDouble();
        System.out.println("Ingrese la moneda a la cual desea convertir(yenes, libras, dolares)");
        moneda = scan.next();
        if(moneda.equals("yenes")) {
            convertido = cantidadEurosAConvertir * 129.852;
        }
        if(moneda.equals("dolares")) {
            convertido = cantidadEurosAConvertir * 1.28611;
        }
        if(moneda.equals("libras")) {
            convertido = cantidadEurosAConvertir * 0.86;
        }
        if(!moneda.equals("yenes") && !moneda.equals("dolares") && !moneda.equals("libras")) {
            System.out.println("Ingreso una moneda invalida");
        } else {
            System.out.println("La cantidad de euros " + cantidadEurosAConvertir + " en " + moneda + " son: " + convertido);
        }
    }
}