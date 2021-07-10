package lucas.introjava;

import java.util.Scanner;

public class Ejercicio11E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, digitos, resto;
        digitos = 1;
        System.out.println("Ingrese el numero a calcular digitos");
        numero = scan.nextInt();
        resto = numero;
        while (resto / 10 >= 1) {
            resto /= 10;
            digitos += 1;
        }
        System.out.println("La cantidad de digitos del numero ingresado " + numero + " es de " + digitos);
    }
}