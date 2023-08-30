/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import Entidades.Rectangulo;

/**
 *
 * @author gabyg
 */
public class extra6 {
        public static void main(String[] args) {
        //Crear Rectangulo
        Rectangulo r1 = new Rectangulo();
        r1.lectura();
        //Calcular Area
        System.out.println("Es el area del rectangulo: " + r1.calcularArea());
            System.out.println("Ahora hacemos el rectangulo1 que los lados son 1=4 y 2=6");
        System.out.println("El area del rectangulo 1 es : " + r1.crearRectangulo1(4, 6).calcularArea1());

    }
}
