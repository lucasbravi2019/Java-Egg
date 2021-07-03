package lucas.introjava;

import java.util.Arrays;

public class Ejercicio22 {
    public static void ejercicio22() {
        int contador = 0;
        int[] vector = new int[100];
        for(int i = 0; i < 100; i++) {
            vector[i] = contador;
            contador += 1;
        }
        System.out.print(Arrays.toString(vector));
    }
}