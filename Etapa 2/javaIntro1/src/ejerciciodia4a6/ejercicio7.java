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
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        int contadorCorrecto = 0;
        int contadorIncorrecto = 0;
        do {
            System.out.println("Ingresa una cadena");
            cadena = sc.nextLine();
            if (cadena.length() < 5 && cadena.startsWith("X") && cadena.endsWith("0")) {
                contadorCorrecto++;
            } else {
                contadorIncorrecto++;
            }
        } while (!cadena.equals("&&&&&"));
        System.out.println("Total lecturas correctas: " + contadorCorrecto);
        System.out.println("Total lecturas incorrectas: " + contadorIncorrecto);
    }
}
