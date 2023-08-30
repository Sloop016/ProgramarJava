/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entity.PardeNumeros;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class PardeNumerosServicio {

    PardeNumeros p1 = new PardeNumeros();
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void mostrarValores(PardeNumeros p1) {
        System.out.println("numero 1: " + p1.getNum1());
        System.out.println("numero 2: " + p1.getNum2());
    }

    public void devolverMayor(PardeNumeros p1) {

        if (p1.getNum1() > p1.getNum2()) {
            System.out.println("el numero mayor es: " + p1.getNum1());
        } else {
            System.out.println("el numero mayor es: " + p1.getNum2());
        }
    }

    public void calcularPotencia(PardeNumeros p1) {

        if (p1.getNum1() > p1.getNum2()) {
            System.out.println(p1.getNum1() + " Elevado a " + p1.getNum2());
            System.out.println(Math.pow(p1.getNum1(), p1.getNum2()));

        } else {
            System.out.println(p1.getNum1() + " Elevado a " + p1.getNum2());
            System.out.println(Math.pow(p1.getNum2(), p1.getNum1()));
        }
    }

    public void calcularRaiz(PardeNumeros p1) {
        if (p1.getNum1() > p1.getNum2()) {
            double rCuadrada = Math.sqrt(p1.getNum1());
            System.out.println("La raiz cuadradada de: " +p1.getNum1() + " es : "
            +rCuadrada);
        }else {
            double rCuadrada = Math.sqrt(p1.getNum2());
            System.out.println("La raiz cuadradada de: " +p1.getNum2() + " es : "
            +rCuadrada);
        }
    }
}
