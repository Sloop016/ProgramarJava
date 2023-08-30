/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import Entidades.rectangulo1;

/**
 *
 * @author gabyg
 */
public class ejercicio4 {

    public static void main(String[] args) {

        rectangulo1 r1 = new rectangulo1();
        r1.datos();
        System.out.println("La superficie del rectangulo es:" + r1.superficie());
        System.out.println("El perimetro del rectangulo es:" + r1.perimetro());
        System.out.println("Dibujado:");
        r1.dibujito();

    }
}
