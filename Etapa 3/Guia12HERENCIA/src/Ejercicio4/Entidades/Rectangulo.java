/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4.Entidades;

import Ejercicio4.Interfaces.calculosFormas;

/**
 *
 * @author gabyg
 */
public class Rectangulo implements calculosFormas {

    protected double base;
    protected double altura;
    protected double area;
    protected double perimetro;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public double calcularArea() {
        this.area = base * altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        this.perimetro = (base * 2) + (altura * 2);
        return perimetro;
    }

}
