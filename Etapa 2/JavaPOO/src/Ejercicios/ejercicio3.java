/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import Entidades.operaciones;

/**
 *
 * @author gabyg
 */
public class ejercicio3 {

    public static void main(String[] args) {
        operaciones o1 = new operaciones();
        o1.crearOP();

        System.out.println("Ingrese cual es la operacion que queiere realizar: ");
        System.out.println("opcion 1: Suma ");
        System.out.println("opcion 2: Resta ");
        System.out.println("opcion 3: Multiplicacion");
        System.out.println("opcion 4: Division ");

        switch (o1.opcion()) {
            case 1:
                System.out.println("La suma de los productos son :");
                System.out.println(o1.suma());
                break;
            case 2:
                System.out.println("La resta de los productos son :");
                System.out.println(o1.resta());
                break;
            case 3:
                System.out.println("La multiplicacion de los productos son :");
                System.out.println(o1.multiplicacion());
                break;
            case 4:
                System.out.println("La division de los productos son :");
                System.out.println(o1.division());
                break;
            default:
                System.out.println("ERROR, No es un numero valido");
                break;
        }
    }
}
