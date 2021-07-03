package lucas.introjava;

import java.util.Scanner;

public class Ejercicio13 {
    public static void ejercicio13() {
        Scanner scan = new Scanner(System.in);
        int nota;
        do{
            System.out.println("Ingrese una nota");
            nota = scan.nextInt();
        } while(nota < 0 || nota > 10);
        System.out.println("La nota es: " + nota);
        scan.close();
    }
}