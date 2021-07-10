package lucas.introjava;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en Celsius");
        double celsius = scan.nextDouble();
        double farenheit;
        farenheit = 32 + 9 / 5 * celsius;
        System.out.println("La temperatura " + celsius + "°C convertida en °F es: " + farenheit + "°F");
        scan.close();
    }
}