/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodia9al11;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class extra7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de términos que desea generar: ");
        System.out.println("");
        int n = sc.nextInt();
        n += 1;
        int[] fibb = new int[n];

        fibb[0] = 0;
        fibb[1] = 1;
        for (int i = 2; i < n; i++) {
            fibb[i] = fibb[i - 1] + fibb[i - 2];
        }
        System.out.println("La sucesión de Fibonacci generada es: ");
        for (int i = 1; i < n; i++) {
            System.out.print(fibb[i] + " ");
        }
    }
}
