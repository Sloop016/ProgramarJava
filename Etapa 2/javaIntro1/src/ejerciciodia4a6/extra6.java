package ejerciciodia4a6;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class extra6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de personas a medir");
        int cantidadPersonas = sc.nextInt();
        float promedioAltura = 0;
        float alturaPersona;
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingresa la altura de la persona");
            alturaPersona = sc.nextFloat();
            promedioAltura += alturaPersona;
        }
        promedioAltura /= cantidadPersonas;
        System.out.println("El promedio de la altura de las personas es de " + promedioAltura);
    }
}
