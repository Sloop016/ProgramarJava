/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class extra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Crearemos una nueva cuenta:");
        Cuenta cuenta = new Cuenta().crearCuenta();
        System.out.println("Desea retirar dinero?  si/no");
        String rta = leer.next();
        if (rta.equalsIgnoreCase("si")) {
            cuenta.retirarDinero(cuenta);
            System.out.println(cuenta.toString());
        } else {
            System.out.println("Hasta pronto.");
        }
    }
}
