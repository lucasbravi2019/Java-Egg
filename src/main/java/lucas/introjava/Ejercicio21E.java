package lucas.introjava;

public class Ejercicio21E {
    public static void rellenar(int n, int m, int[][] matriz) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static double sumar(int[][] matriz, int n, int m) {
        double suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
                System.out.println(suma);
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int n, m;
        double suma;
        n = 3;
        m = 4;
        int[][] matriz = new int[n][m];
        rellenar(n, m, matriz);
        suma = sumar(matriz, n, m);
        System.out.println("La suma de sus elementos es " + suma);
    }
}
