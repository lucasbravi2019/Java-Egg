package lucas.introjava;

public class Ejercicio6E {
    public static void main(String[] args) {
        int n = 6;
        double suma = 0;
        double promedio;
        int contador = 0;
        double[] alturas = { 1.59, 1.78, 1.64, 1.48, 1.50, 1.58 };
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresar la altura de la persona");
            if (alturas[i] < 1.6) {
                contador += 1;
                suma += alturas[i];
                // System.out.println(alturas[i]);
            }
        }
        promedio = suma / contador;
        System.out.println("El promedio de alturas menores a 1.59 es de " + promedio);
    }
}