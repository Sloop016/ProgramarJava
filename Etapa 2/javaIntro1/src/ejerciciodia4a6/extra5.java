package ejerciciodia4a6;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author gabyg
 */
public class extra5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige la clase de socio, en Mayusculas");
        String opcion = sc.next();
        System.out.println("Ingrese el valor del tratamiento");
        double importe = sc.nextInt();
        double descuento;
        double cuota;
        switch (opcion) {
            case "A": {
                descuento = importe * 0.5;
                cuota = 500;
                importe = cuota + descuento;
                System.out.println("El socio tiene un descuento del 50% en el tratamiento, y debe pagar una cuota de " + cuota);
                break;
            }
            case "B": {
                descuento = importe * 0.65;
                cuota = 250;
                importe = cuota + descuento;
                System.out.println("El socio tiene un descuento del 35% en el tratamiento, y debe pagar una cuota de " + cuota);
            break;
            }
            case "C": {
                cuota = 100;
                importe += cuota;
                System.out.println("El socio tiene NO descuento en el tratamiento, y debe pagar una cuota de " + cuota);
            break;
            }
        }
        System.out.println("El monto total a pagar es de " + importe);
    }
}
