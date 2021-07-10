package lucas.introjava;

public class Ejercicio18E {
    public static void main(String[] args) {
        int[] vectorA = { 1, 2, 3, 5, 6 };
        int[] vectorB = { 1, 3, 3, 5, 77 };
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            if (vectorA[i] != vectorB[i]) {
                System.out.println(vectorA[i] + " != " + vectorB[i]);
                System.out.println("Los vectores no son iguales");
                break;
            } else {
                System.out.println(vectorA[i] + " = " + vectorB[i]);
                contador += 1;
            }
        }
        if (contador == 5) {
            System.out.println("Los vectores son iguales");
        }
    }
}
