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
public class puntos {

    static Scanner sc = new Scanner(System.in);
    public double x1;
    public double x2;
    public double y1;
    public double y2;

    public puntos() {
    }

    //-------------------------------------------
    // Contructor
    //-------------------------------------------
    public puntos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    //-------------------------------------------
    // Getter & Setter
    //-------------------------------------------
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    //-------------------------------------------
    // Lectura
    //-------------------------------------------
    public void crearPuntos() {
        System.out.println("Ingrese los putos de la coordenadas: ");
        System.out.println("Coordenada X1: ");
        x1 = sc.nextDouble();
        System.out.println("Coordenada X2: ");
        x2 = sc.nextDouble();
        System.out.println("Coordenada Y1: ");
        y1 = sc.nextDouble();
        System.out.println("Coordenada Y2: ");
        y2 = sc.nextDouble();

    }

    public double dist() {
        return Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
    }

}
