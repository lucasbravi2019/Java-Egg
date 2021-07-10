package lucas.introjava;

import java.util.Scanner;

public class Ejercicio10E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroAleatorio, numeroAdivinado;
        do {
            numeroAleatorio = (int) Math.floor(Math.random() * 10) * (int) Math.floor(Math.random() * 10);
            System.out.println(numeroAleatorio);
            System.out.println("Ingrese el numero generado");
            numeroAdivinado = scan.nextInt();
            if (numeroAdivinado == numeroAleatorio) {
                System.out.println("Adivino el numero!");
                break;
            } else {
                System.out.println("No adivino el numero! Siga participando!");
            }
        } while (numeroAleatorio != numeroAdivinado);
        scan.close();
    }
}