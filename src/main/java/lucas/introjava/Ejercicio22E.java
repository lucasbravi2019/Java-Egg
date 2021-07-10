package lucas.introjava;

import java.util.Scanner;
import java.util.Objects;

public class Ejercicio22E {
    public static int generarFilaColumna(int max) {
        return (int) (Math.random() * max);
    }

    public static void rellenarSopa(String[][] matriz, String palabra) {
        boolean vacio = true;
        int maximo, fila, columna;
        do {
            maximo = (int) (20 - palabra.length());
            fila = generarFilaColumna(20);
            columna = generarFilaColumna(maximo);
            for (int i = 0; i < palabra.length(); i++) {
                if (matriz[fila][(int) (columna + i)] != null) {
                    if (!matriz[fila][(int) (columna + i)].equals("0")) {
                        vacio = false;
                    }
                }
            }
            if (vacio) {
                break;
            }
        } while (!vacio);
        for (int j = 0; j < palabra.length(); j++) {
            matriz[fila][columna + j] = palabra.substring(j, (j + 1));
        }
    }

    public static void escribirSopa(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void rellenarSopaCeros(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = "0";
            }
        }
    }

    public static void rellenarSopaAleatorio(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j].equals("0")) {
                    matriz[i][j] = Integer.toString((int) (Math.random() * 10));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palabra;
        String[][] sopa = new String[20][20];
        rellenarSopaCeros(sopa);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese una palabra entre 3 a 5 caracteres");
            palabra = "tres";
            // while (palabra.length() > 5 || palabra.length() < 3) {
            // System.out.print("Ingreso una palabra invalida, por favor ingrese una palabra
            // entre 3 a 5 caracteres");
            // palabra = scan.next();
            // }
            rellenarSopa(sopa, palabra);
        }
        rellenarSopaAleatorio(sopa);
        escribirSopa(sopa);
    }
}
