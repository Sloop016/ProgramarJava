/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodia4a6;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la dimesion del cuadrado que desea");
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || j == 0 || j == num - 1 || i == num - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
