package lucas.introjava;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        int numero;
        String cadena;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un numero");
            numero = scan.nextInt();
            while (numero > 20) {
                System.out.println("Escriba un numero menor o igual a 20");
                numero = scan.nextInt();
            }
            cadena = "";
            for (int j = 0; j < numero; j++) {
                cadena += "*";
            }
            System.out.print(numero + " " + cadena);
            System.out.println("");
        }
        scan.close();
    }
}
