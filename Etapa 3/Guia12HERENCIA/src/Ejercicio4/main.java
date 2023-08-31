/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import Ejercicio4.Entidades.Circulo;
import Ejercicio4.Entidades.Rectangulo;

/**
 *
 * @author gabyg
 */
public class main {

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(5d, 10d);
        System.out.println("Area: " + rectangulo1.calcularArea() + " Perimetro: " + rectangulo1.calcularPerimetro());
        Rectangulo rectangulo2 = new Rectangulo(10d, 5d);
        System.out.println("Area: " + rectangulo2.calcularArea() + " Perimetro: " + rectangulo2.calcularPerimetro());
        Circulo circulo1 = new Circulo(5d);
        System.out.println("Area: " + circulo1.calcularArea() + " Perimetro: " + circulo1.calcularPerimetro());
        Circulo circulo2 = new Circulo(10d);
        System.out.println("Area: " + circulo2.calcularArea() + " Perimetro: " + circulo2.calcularPerimetro());
    }
}
