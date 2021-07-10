package lucas.introjava;

public class Ejercicio19E {
    public static void rellenar(int[] vectorARellenar, int[] valores) {
        for (int i = 0; i < 9; i++) {
            vectorARellenar[i] = valores[i];
        }
    }

    public static void rellenarAleatorio(int[] vector) {
        for (int i = 0; i < 9; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void imprimir(int[] vector) {
        System.out.print("[ ");
        for (int i = 0; i < 9; i++) {
            if (i < (int) (9 - 1)) {
                System.out.print(vector[i] + ", ");
            } else {
                System.out.print(vector[i]);
            }
        }
        System.out.print(" ]");
    }

    public static void main(String[] args) {
        int[] vectorParametro = new int[9];
        int[] vector = new int[9];
        rellenarAleatorio(vectorParametro);
        rellenar(vector, vectorParametro);
        imprimir(vector);
    }
}
