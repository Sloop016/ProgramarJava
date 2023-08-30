/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import Entidades.Empleado;

/**
 *
 * @author gabyg
 */
public class extra5 {
      public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 35, 10000.0);
        empleado1.calcularAumento(empleado1);
        System.out.println(empleado1.toString());
        Empleado empleado2 = new Empleado("Pedro", 25, 5000.0);
        empleado2.calcularAumento(empleado2);
        System.out.println(empleado2.toString());
    }

}  

