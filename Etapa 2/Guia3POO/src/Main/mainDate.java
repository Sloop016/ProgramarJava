/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Servicio.DateServicio;
import java.util.Date;

/**
 *
 * @author gabyg
 */
public class mainDate {

    public static void main(String[] args) {
        DateServicio sv = new DateServicio();
        Date fecha = sv.fechaNacimiento();
        System.out.println(sv.fechaNacimiento());
        Date fechaActual = sv.fechaActual();
        System.out.println(fechaActual);
        sv.diferencia(fecha, fechaActual);
        System.out.println("dife 2: " + sv.diferencia2(fecha, fechaActual));
    }
}
