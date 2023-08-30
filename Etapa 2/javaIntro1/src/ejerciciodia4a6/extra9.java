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
public class extra9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero que quiere divir");
        Double num = sc.nextDouble();
        System.out.println("Ingrese el divisor");
        Double divisor = sc.nextDouble();
        restaDivisor(num, divisor);
    }

    public static void restaDivisor(Double num, Double divisor) {
        int contador = 0;
        while (num > divisor) {
            num -= divisor;
            contador++;
        }
        System.out.println("Dado que " + num + " es menor que " + divisor + ", entonces: el residuo es " + num + " y el cociente es " + contador);
    }
}
