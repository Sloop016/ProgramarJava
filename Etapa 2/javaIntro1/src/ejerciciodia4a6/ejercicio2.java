/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodia4a6;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palabra = "eureka";

        final int INTENTOS = 3;
        boolean acierto = false;
        String afirma;
        for (int i = 0; i < INTENTOS && !acierto; i++) {
            System.out.println("Introduce una palabra");
            afirma = sc.next();

            if (!afirma.equals(palabra)) {
            } else {
                System.out.println("Enhorabuena, acertaste");
                acierto = true;
            }
        }
        System.out.println("Programa finalizado");
    }
}
