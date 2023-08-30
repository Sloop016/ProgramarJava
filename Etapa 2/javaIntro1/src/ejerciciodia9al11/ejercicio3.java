/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodia9al11;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector:");
        int dimv = sc.nextInt();
        
        int [] vec = new int [dimv];
        int dig1 = 0;
        int dig2 = 0;
        int dig3 = 0;
        int dig4 = 0;
        int dig5 = 0;
        
        System.out.println("Ingrese los valores:");
        for (int i = 0; i < dimv; i++) {
            vec[i] = sc.nextInt();
            String num = Integer.toString(vec[i]);
            if (num.length() <= 5) {
                if (num.length() == 1) {
                    dig1 += 1; 
                }
                if (num.length() == 2) {
                    dig2 += 1; 
                }
                if (num.length() == 3) {
                    dig3 += 1; 
                }
                if (num.length() == 4) {
                    dig4 += 1; 
                }
                if (num.length() == 5) {
                    dig5 += 1; 
                }
            } else {
                System.out.println("Tiene que ingresar un numero menor de 5 digitos");
            }
        }
        System.out.println("1 digito = " + dig1);
        System.out.println("2 digitos = " + dig2);
        System.out.println("3 digitos = " + dig3);
        System.out.println("4 digitos = " + dig4);
        System.out.println("5 digitos = " + dig5);
    }
    
}