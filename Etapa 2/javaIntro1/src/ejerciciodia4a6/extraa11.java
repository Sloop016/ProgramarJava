package ejerciciodia4a6;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class extraa11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea saber la cantidad de digitos");
        int numero = sc.nextInt();
        System.out.println("El numero tiene " + digitos(numero) + " digitos");
    }

    public static int digitos(int numero) {
        int digitos = 0;
        while (numero > 0) {
            numero /= 10;
            digitos++;
        }
        return digitos;
    }
}
