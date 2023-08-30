/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodia9al11;

/**
 *
 * @author gabyg
 */
public class ejercicio1 {

    public static void main(String[] args) {
        
        int[] numeros = new int[100];
        
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1; 
        }
        
        for (int i = 99; i > -1; i--) {
            System.out.print("[" + numeros[i] + "]");
        }
    }
}
