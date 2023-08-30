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
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String let;
        do {
            System.out.println("Ingresa una palabra de 8 caracteres");
            let = input.next();
            if (let.length() != 8) {
                System.out.println("INCORRECTO");
            } else {
                System.out.println("CORRECTO");
            }
        } while (let.length() != 8);
    }
        
   
    
}
