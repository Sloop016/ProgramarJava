/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import Entidades.puntos;

/**
 *
 * @author gabyg
 */
public class extra2 {

    public static void main(String[] args) {
        puntos p1 = new puntos();
        p1.crearPuntos();
        System.out.println("La distancia entre puntos es: " + p1.dist());
    }
}