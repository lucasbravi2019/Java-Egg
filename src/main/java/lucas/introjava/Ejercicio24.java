package lucas.introjava;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        int numero, uno, dos, tres, cuatro, cinco;
        uno = 0;
        dos = 0;
        tres = 0;
        cuatro = 0;
        cinco = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a generar");
        numero = scan.nextInt();
        int[] vector = new int[numero];
        Random numeroAleatorio = new Random();
        int digitos;
        for (int i = 0; i < numero; i++) {
            vector[i] = numeroAleatorio.nextInt(100000);
        }
        for (int i = 0; i < numero; i++) {
            digitos = 1;
            int num = vector[i];
            // System.out.println("El numero del vector es: " + vector[i]);
            if (num / 10 < 1) {
                digitos = 1;
                uno += 1;
                // System.out.println("Tiene un digito");
                break;
            }
            while (num / 10 >= 1) {
                digitos += 1;
                num = num / 10;
            }

            if (digitos == 2) {
                dos += 1;
                // System.out.println("Tiene 2 digitos");
            }
            if (digitos == 3) {
                tres += 1;
                // System.out.println("Tiene 3 digitos");
            }
            if (digitos == 4) {
                cuatro += 1;
                // System.out.println("Tiene 4 digitos");
            }
            if (digitos == 5) {
                cinco += 1;
                // System.out.println("Tiene 5 digitos");
            }

        }
        System.out.println("Numeros con 1 digito: " + uno);
        System.out.println("Numeros con 2 digitos: " + dos);
        System.out.println("Numeros con 3 digitos: " + tres);
        System.out.println("Numeros con 4 digitos: " + cuatro);
        System.out.println("Numeros con 5 digitos: " + cinco);
    }
}
