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
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra");
        String frase = input.next();

        if (frase.startsWith("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
