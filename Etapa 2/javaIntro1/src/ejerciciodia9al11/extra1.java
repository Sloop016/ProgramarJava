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
public class extra1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int dimv = sc.nextInt();

        int[] vector = new int[dimv];
        int suma = 0;

        System.out.println("Ahora rellene la matriz");
        for (int i = 0; i < dimv; i++) {
            System.out.println(" [" + i + "] >> ");
            vector[i] = sc.nextInt();
            suma += vector[i];
        }

        System.out.println("El resultado de la suma ed los elementos es: " + suma);
    }
}
