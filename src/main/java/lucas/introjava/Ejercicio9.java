package lucas.introjava;

import java.util.Scanner;

public class Ejercicio9 {
    public static void ejercicio9() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = scan.nextLine();
        scan.close();
        if(palabra.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}