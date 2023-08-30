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
public class Rectangulo {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private double lado1;
    private double lado2;
    private double area;

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
//lectura datos

    public void lectura() {
        System.out.println("Ingrese los lados del rectangulo: ");
        System.out.print("lado 1: ");
        lado1 = sc.nextInt();
        System.out.print("lado 2: ");
        lado2 = sc.nextInt();
    }

    public double calcularArea() {
        area = lado1 * lado2;
        return area;
    }

    @Override
    public String toString() {
        return "el Area del rectangulo es: " + area;
    }

    public Rectangulo crearRectangulo1(double lado1, double lado2) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setLado1(lado1);
        rectangulo.setLado2(lado2);
        return rectangulo;
    }

    /**
     *
     * @return
     */
    public double calcularArea1() {
        area = lado1 * lado2;
        return area;

    }
}
