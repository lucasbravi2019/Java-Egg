package lucas.introjava;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el tipo de motor");
        int tipoMotor = scan.nextInt();
        scan.close();
        if (tipoMotor == 1) {
            System.out.println("La bomba es una bomba de agua");
        } else if (tipoMotor == 2) {
            System.out.println("La bomba es una bomba de gasolina");
        } else if (tipoMotor == 3) {
            System.out.println("La bomba es una bomba de hormigon");
        } else if (tipoMotor == 4) {
            System.out.println("La bomba es una bomba de pasta alimenticia");
        } else {
            System.out.println("No existe un valor valido para tipo de bomba");
        }
        /*
         * switch(tipoMotor) { case 1:
         * System.out.println("La bomba es una bomba de agua"); break; case 2:
         * System.out.println("La bomba es una bomba de gasolina"); break; case 3:
         * System.out.println("La bomba es una bomba de hormigon"); break; case 4:
         * System.out.println("La bomba es una bomba de pasta alimenticia"); break;
         * default: System.out.println("No existe un valor valido para tipo de bomba");
         * break; }
         */
    }
}
