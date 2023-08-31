/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2y3;

import Ejercicio2y3.Entidad.Electrodomestico;
import Ejercicio2y3.Entidad.Lavadora;
import Ejercicio2y3.Entidad.Televisor;
import Ejercicio2y3.Servicio.ServicioElectrodomestico;
import java.util.ArrayList;

/**
 *
 * @author gabyg
 */
public class main {

    public static void main(String[] args) {
        ServicioElectrodomestico serv = new ServicioElectrodomestico();
        ArrayList<Electrodomestico> ElArray = new ArrayList();
        Lavadora lavadora1 = new Lavadora(1000d, "Blanco", 'A', 80d, 15);
        Lavadora lavadora2 = new Lavadora(1500d, "Negro", 'F', 60d, 10);
        Televisor televisor1 = new Televisor(500d, "Gris", 'B', 15d, 32, true);
        Televisor televisor2 = new Televisor(500d, "Negro", 'C', 10d, 24, false);
        ElArray.add(lavadora1);
        ElArray.add(lavadora2);
        ElArray.add(televisor1);
        ElArray.add(televisor2);

        double lavadoras = 0;
        double televisores = 0;
        for (Electrodomestico electrodomesticoobj : ElArray) {
            //NO BORRAR
            electrodomesticoobj.precioFinal();
            if (electrodomesticoobj instanceof Lavadora) {
                System.out.println("Lavadora: " + electrodomesticoobj.getPrecio());
                lavadoras += electrodomesticoobj.getPrecio();
            }
            if (electrodomesticoobj instanceof Televisor) {
                System.out.println("Televisor: " + electrodomesticoobj.getPrecio());
                televisores += electrodomesticoobj.getPrecio();
            }
        }
        String totales1 = String.format("Total lavadoras: %.2f", lavadoras);
        String totales2 = String.format("Total televisores: %.2f", televisores);
        System.out.println(totales1);
        System.out.println(totales2);
        System.out.println("Total: " + (lavadoras + televisores));
    }
}