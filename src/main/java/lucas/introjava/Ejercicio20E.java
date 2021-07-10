package lucas.introjava;

import java.util.Arrays;

public class Ejercicio20E {
    public static int rellenarNotas() {
        return (int) (Math.random() * 10);
    }

    public static void main(String[] args) {
        double practico1, practico2, integrador1, integrador2, promedio;
        double[] nota = new double[10];
        int aprobados, desaprobados;
        aprobados = 0;
        desaprobados = 0;
        for (int i = 0; i < 10; i++) {
            practico1 = rellenarNotas();
            practico2 = rellenarNotas();
            integrador1 = rellenarNotas();
            integrador2 = rellenarNotas();
            promedio = practico1 * .1 + practico2 * .15 + integrador1 * .25 + integrador2 * .5;
            nota[i] = promedio;
            if (promedio >= 7) {
                aprobados += 1;
            } else {
                desaprobados += 1;
            }
        }
        System.out.println("La cantidad de aprobados es de " + aprobados);
        System.out.println("La cantidad de desaprobados es de " + desaprobados);
        System.out.println("Las notas son: " + Arrays.toString(nota));
    }
}
