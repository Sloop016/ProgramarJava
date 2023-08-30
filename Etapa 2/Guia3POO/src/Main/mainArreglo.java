/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Servicio.ArregloServicio;

/**
 *
 * @author gabyg
 */
public class mainArreglo {

    public static void main(String[] args) {

        ArregloServicio service = new ArregloServicio();
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        service.inicializarA(arregloA);
        System.out.println("Arreglo A:");
        service.mostrar(arregloA);
        System.out.println();
        System.out.println("Arreglo A de mayor a menor:");
        service.ordenar(arregloA);
        service.mostrar(arregloA);
        System.out.println();
        System.out.println("Arreglo B:");
        service.inicializarB(arregloA, arregloB);
        service.mostrar(arregloB);

    }
}

