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
public class rectangulo1 {

    static Scanner sc = new Scanner(System.in);
    private int base;
    private int altura;

    public rectangulo1() {

    }

    public rectangulo1(int base, int altura) {
        this.base = base;
        this.altura = altura;

    }

    public void datos() {
        System.out.println("ingrese el dato del cuadrado");
        System.out.println("Base:");
        base = sc.nextInt();
        System.out.println("Altura:");
        altura = sc.nextInt();
    }

    public double superficie() {
        return base * altura;
    }

    public double perimetro() {
        return (base * altura) * 2;
    }

    public void dibujito() {
        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= altura; j++) {
                if (i == 1 || i == base || j == 1 || j == altura) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "Rectangulo: " + "base=" + base + ", altura=" + altura ;
    }
}
