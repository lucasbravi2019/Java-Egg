package lucas.introjava;

import java.util.Scanner;

public class Ejercicio13E {
    public static void main(String[] args) {
        int familias, hijos, cantidadHijosTotales;
        double edad;
        double edadMedia = 0;
        Scanner scan = new Scanner(System.in);
        edad = 0;
        cantidadHijosTotales = 0;
        System.out.println("Ingrese la cantidad de familias");
        familias = scan.nextInt();
        for (int i = 0; i < familias; i++) {
            System.out.println("Ingrese la cantidad de hijos que tiene");
            hijos = scan.nextInt();
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad de su hijo " + (int) (j + 1));
                edad += scan.nextInt();
                cantidadHijosTotales += 1;
            }
        }
        edadMedia = Math.round(edad / cantidadHijosTotales);
        System.out.println("La edad media de todos los hijos es de " + (int) edadMedia);
    }
}
