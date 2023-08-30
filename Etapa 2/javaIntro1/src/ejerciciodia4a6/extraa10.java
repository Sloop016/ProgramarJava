package ejerciciodia4a6;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class extraa10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAdivinar;
        int numrandom = numeroAleatorio();
        do {
            System.out.println("Ingrese un numero para adivinar la multiplicacion de dos numeros entre 0 y 10");
            numAdivinar = sc.nextInt();
            if (numAdivinar > numrandom) {
                System.out.println("El numeros es mas chico");
            } else if (numAdivinar < numrandom) {
                System.out.println("El numeros es mas grande");
            }
        } while (!adivinanza(numAdivinar, numrandom));
        System.out.println("Adivinaste el numeros!");
    }

    public static int numeroAleatorio() {
        int num1, num2;
        num1 = (int) (Math.random() * 10);
        num2 = (int) (Math.random() * 10);
        return num1 * num2;
    }

    public static boolean adivinanza(int numIngresado, int numeroAleatorio) {
        return numIngresado == numeroAleatorio;
    }
}
