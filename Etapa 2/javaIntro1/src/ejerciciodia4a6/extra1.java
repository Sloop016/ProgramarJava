package ejerciciodia4a6;

import java.util.Scanner;

/**Dado un tiempo en minutos, calcular su 
 * equivalente en días y horas. Por ejemplo, si el usuario ingresa 
 * 1600 minutos, el sistema debe calcular 
 * su equivalente: 1 día, 2 horas
 */
public class extra1 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero de minutos a convertir");
        Scanner time = new Scanner(System.in);
                double minutos, horas, dias;
        minutos = time.nextInt();
        dias = 0;
        horas = minutos / 60;
        while (horas > 24) {
            dias++;
            horas = horas - 24;
        }
        dias = Math.floor(dias);
        horas = Math.floor(horas);
        System.out.println((int) dias + " Dia/s y " + (int) horas + " hora/s");
    }
    
}
