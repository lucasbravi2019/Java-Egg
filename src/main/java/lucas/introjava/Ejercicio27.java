package lucas.introjava;

import java.util.Arrays;

public class Ejercicio27 {
    public static void main(String[] args) {
        int[] numeros = { 2, 7, 6, 9, 5, 1, 4, 3, 8 };
        int contador = 0;
        int sumarFilas;
        int sumarColumnas;
        int diagonalP = 0;
        int diagonalS = 0;
        int[] sumaFilas = new int[3];
        int[] sumaColumnas = new int[3];
        int[] sumaDiagonales = new int[2];
        int[][] cuadrado = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (numeros[contador] > 9 || numeros[contador] < 1) {
                    System.out.println("Ingreso numeros invalidos");
                } else {
                    cuadrado[i][j] = numeros[contador];
                    contador += 1;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cuadrado[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            sumarFilas = 0;
            sumarColumnas = 0;
            for (int j = 0; j < 3; j++) {
                sumarFilas += cuadrado[i][j];
                sumarColumnas += cuadrado[j][i];
                if (i + j == 2) {
                    diagonalS += cuadrado[i][j];
                }
            }
            diagonalP += cuadrado[i][i];
            sumaFilas[i] = sumarFilas;
            sumaColumnas[i] = sumarColumnas;
        }
        sumaDiagonales[0] = diagonalS;
        sumaDiagonales[1] += diagonalP;
        contador = 0;
        for (int i = 0; i < 3; i++) {
            if (sumaFilas[i] == sumaColumnas[i] && sumaFilas[i] == sumaDiagonales[0]
                    && sumaDiagonales[0] == sumaDiagonales[1]) {
                contador += 1;
            }
        }
        if (contador == 3) {
            System.out.println("Es un cuadrado magico");
        } else {
            System.out.println("No es un cuadrado magico");
        }
        System.out.println(Arrays.toString(sumaDiagonales));
        System.out.println(Arrays.toString(sumaFilas));
        System.out.println(Arrays.toString(sumaColumnas));
    }
}
