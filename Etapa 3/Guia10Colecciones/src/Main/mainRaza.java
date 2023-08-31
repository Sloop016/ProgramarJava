/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Servicios.RazaServicio;
import java.util.ArrayList;

/**
 *
 * @author gabyg
 */
public class mainRaza {
    public static void main(String[] args) {
        RazaServicio sv = new RazaServicio();
        ArrayList<String> razas = new ArrayList<>();
        sv.crearRaza(razas);
        System.out.println("Eliminar con It");
        sv.eliminarRaza(razas);
    }
}
