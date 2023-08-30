package ejerciciodia2y3;
import java.util.Scanner;
/**
Dada una cantidad de grados centígrados
se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente 
es: F = 32 + (9 * C / 5).
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados cª que desea transformar: ");
        int C = leer.nextInt();
        double F = ( C * 9/5) + 32 ;
        System.out.println("Su resultado es: " + F);
    }
}
