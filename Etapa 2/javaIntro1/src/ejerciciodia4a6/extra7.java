package ejerciciodia4a6;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class extra7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numero que desea calcular");
        int n = sc.nextInt();
        int num, numMin = 0, numMax = 0, iterador;
        iterador = 0;
        while (iterador < n) {
            System.out.println("Ingresa un numero");
            num = sc.nextInt();
            if (iterador == 0) {
                numMax = num;
                numMin = num;
            }
            if (numMax < num) {
                numMax = num;
            }
            if (numMin > num) {
                numMin = num;
            }
            iterador++;
        }

        System.out.println("El numero mas bajo es " + numMin);
        System.out.println("El numero mas alto es " + numMax);
        iterador = 0;
        do {
            System.out.println("Ingresa un numero");
            num = sc.nextInt();
            if (iterador == 0) {
                numMax = num;
                numMin = num;
            }
            if (numMax < num) {
                numMax = num;
            }
            if (numMin > num) {
                numMin = num;
            }
            iterador++;
        } while (iterador < n);
        System.out.println("El numero mas bajo es " + numMin);
        System.out.println("El numero mas alto es " + numMax);
    }
}
