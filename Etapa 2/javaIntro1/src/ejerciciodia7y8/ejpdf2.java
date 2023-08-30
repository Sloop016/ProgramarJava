/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodia7y8;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class ejpdf2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Ingresa dos números");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        EsMultiplo(num1, num2);
    }

    public static void EsMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("El número " + num1 + " es múltiplo de " + num2);
        } else {
            System.out.println("El número " + num1 + " NO es múltiplo de " + num2);
        }
    }
}

