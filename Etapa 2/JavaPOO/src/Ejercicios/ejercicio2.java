/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import Entidades.circunferencia;

/**
 *
 * @author gabyg
 */
public class ejercicio2 {

    public static void main(String[] args) {
        circunferencia c1 = new circunferencia();
        c1.crearCircunferencia();
        System.out.println("El area de la circunferencia es : " + c1.area());
        System.out.println("El perimetro de la circunferencia es : " + c1.per());
        
        
    }
}
