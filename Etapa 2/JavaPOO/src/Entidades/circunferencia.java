/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class circunferencia {

    static Scanner sc = new Scanner(System.in);
    public double rad;
    public double rad1;

    public circunferencia() {

    }

    public circunferencia(double rad) {
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public void crearCircunferencia() {
        System.out.println("Ingrese el Radio a Convertir: ");
        rad = sc.nextDouble();
    }

    public double area() {
        return Math.PI * (Math.pow(rad, 2));
    }

    public double per() {
        return 2 * Math.PI * rad;
    }
}
