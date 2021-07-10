package lucas.introjava;

import java.util.Scanner;

public class Ejercicio1E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos");
        int minutos = scan.nextInt();
        int horas = (int) Math.floor(minutos / 60);
        int dias = horas / 24;
        if (horas >= 24) {
            horas -= 24;
            dias += 1;
        }
        System.out.println("El tiempo ingresado de " + minutos + " minutos en dias y horas es: " + dias + " dias y "
                + horas + " horas.");

    }
}