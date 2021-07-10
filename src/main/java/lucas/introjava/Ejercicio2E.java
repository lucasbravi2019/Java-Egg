package lucas.introjava;

public class Ejercicio2E {
    public static void main(String[] args) {
        int aux, A, B, C, D;
        A = 23;
        B = 26;
        C = 14;
        D = 156;
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }
}