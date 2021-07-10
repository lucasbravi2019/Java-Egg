package lucas.introjava;

import java.util.Scanner;

public class Ejercicio15E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mostrar;
        System.out.println("Ingrese la cantidad de personas que ingresara");
        int personas = scan.nextInt();
        var nombres = new String[personas];
        var edad = new int[personas];
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese el nombre de la persona");
            nombres[i] = scan.next();
            System.out.println("Ingrese la edad");
            edad[i] = scan.nextInt();
        }
        for (int i = 0; i < personas; i++) {
            System.out.println("Su nombre: " + nombres[i]);
            System.out.println("Su edad: " + edad[i]);
            if (i < (int) (personas - 1)) {
                System.out.println("Desea seguir mostrando personas? (Si/No)");
                mostrar = scan.next();
                if (mostrar.equals("Si")) {
                    continue;
                }
                if (mostrar.equals("No")) {
                    break;
                }
            }
        }
        scan.close();
    }
}
