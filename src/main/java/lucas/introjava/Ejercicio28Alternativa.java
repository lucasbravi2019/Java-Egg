package lucas.introjava;

import java.util.Arrays;

public class Ejercicio28Alternativa {
    public static void main(String[] args) {
        int contador = 0;
        int[][] matrizGrande = new int[10][10];

        // Vector para rellenar matriz grande
        int[] vectorGrande = { 1, 26, 36, 47, 5, 6, 72, 81, 95, 10, 11, 12, 13, 21, 41, 22, 67, 20, 10, 61, 56, 78, 87,
                90, 9, 90, 17, 12, 87, 67, 41, 87, 24, 56, 97, 74, 87, 42, 64, 35, 32, 76, 79, 1, 36, 5, 67, 96, 12, 11,
                99, 13, 54, 88, 89, 90, 75, 12, 41, 76, 67, 78, 87, 45, 14, 22, 26, 42, 56, 78, 98, 45, 34, 23, 32, 56,
                74, 16, 19, 18, 24, 67, 97, 46, 87, 13, 67, 89, 93, 24, 21, 68, 78, 98, 90, 67, 12, 41, 65, 12 };

        // Rellenar matriz grande
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizGrande[i][j] = vectorGrande[contador];
                contador += 1;
            }
        }

        // Imprimir matriz grande
        System.out.println("Matriz Grande");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrizGrande[i][j] + " ");
            }
            System.out.println("");
        }

        // Vector para rellenar matriz chica
        int[] vectorChico = { 36, 5, 67, 89, 90, 75, 14, 22, 26 };

        // Rellenar matriz chica
        int[][] matrizChica = new int[3][3];
        contador = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizChica[i][j] = vectorChico[contador];
                contador += 1;
            }
        }

        // Mostrar matriz chica
        System.out.println("Matriz Chica");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizChica[i][j] + " ");

            }
            System.out.println("");
        }

        int[][] aux = new int[3][3];
        int x;
        int y;
        int cantmatrices = 1;
        boolean encontrado = false;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (!encontrado) {
                    x = 0;
                    System.out.println("Matriz: " + cantmatrices);
                    for (int k = i; k < (i + 3); k++) {
                        y = 0;
                        for (int l = j; l < (j + 3); l++) {
                            aux[x][y] = matrizGrande[k][l];
                            System.out.print(aux[x][y] + " ");
                            y++;
                        }
                        System.out.println("");
                        x++;
                    }
                    if (Arrays.deepEquals(aux, matrizChica)) {
                        encontrado = true;
                        break;
                    }
                    cantmatrices++;
                } else {
                    break;
                }
            }
        }

        if (encontrado) {
            System.out.println(
                    "Las matrices son iguales, por lo tanto la matriz esta contenida en la matriz: " + cantmatrices);
        } else {
            System.out.println("La matriz no esta contenida");
        }
    }
}
