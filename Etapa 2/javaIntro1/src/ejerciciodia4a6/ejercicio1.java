package ejerciciodia4a6;

import java.util.Scanner;

/**
 * Crear un programa que dado un número determine si es par o impar.
 */
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Su numero es par");
        } else {
            System.out.println("Su numero es impar");
        }
    }
}
