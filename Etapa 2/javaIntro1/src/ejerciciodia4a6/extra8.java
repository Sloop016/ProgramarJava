package ejerciciodia4a6;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class extra8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int contadorPares = 0;
        int contadorImpares = 0;
        do {
            System.out.println("Ingresa un numero");
            num = sc.nextInt();
            if (num % 2 == 0 && num > 0) {
                contadorPares++;
            } else if (num % 2 != 0 && num > 0) {
                contadorImpares++;
            }
        } while (num % 5 != 0);
        System.out.println("Se leyeron " + contadorPares + " numero pares");
        System.out.println("Se leyeron " + contadorImpares + " numero impares");
    }
}
