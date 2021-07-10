package lucas.introjava;

public class Ejercicio18 {
    public static void main(String[] args) {
        String cadena;
        int unidad = 0;
        int decena = 0;
        int centena = 0;
        String unid;
        String dec;
        String cent;
        boolean seguir = true;
        while (seguir) {
            if (unidad == 3) {
                unid = "E";
            } else {
                unid = String.valueOf(unidad);
            }
            if (decena == 3) {
                dec = "E";
            } else {
                dec = String.valueOf(decena);
            }
            if (centena == 3) {
                cent = "E";
            } else {
                cent = String.valueOf(centena);
            }
            cadena = cent + " - " + dec + " - " + unid;
            unidad += 1;
            if (unidad == 10) {
                unidad = 0;
                decena += 1;
            }
            if (decena == 10) {
                decena = 0;
                centena += 1;
            }
            if (centena == 9 && decena == 9 && unidad == 9) {
                seguir = false;
            }
            System.out.println(cadena);
        }
    }
}
