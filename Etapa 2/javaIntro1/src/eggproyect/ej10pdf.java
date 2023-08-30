/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggproyect;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class ej10pdf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros ");
        int n = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();

        if (n <= 20) {
            System.out.print(n);
            for (int i = 0; i < n; i++) {
                System.out.print(" *");
            }
        } else {
            System.out.print("El numero ingresado en invalido");

        }
        System.out.println(" ");
        if (n2 <= 20) {
            System.out.print(n2);
            for (int i = 0; i < n2; i++) {
                System.out.print(" *");
            }
        } else {
            System.out.print("El numero ingresado en invalido");

        }
        System.out.println(" ");
        if (n3 <= 20) {
            System.out.print(n3);
            for (int i = 0; i < n3; i++) {
                System.out.print(" *");

            }
        } else {
            System.out.print("El numero ingresado en invalido");

        }
        System.out.println(" ");
        if (n4 <= 20) {
            System.out.print(n4);
            for (int i = 0; i < n4; i++) {
                System.out.print(" *");

            }
        } else {
            System.out.print("El numero ingresado es invalido");

        }

        System.out.println(" ");

    }
}
