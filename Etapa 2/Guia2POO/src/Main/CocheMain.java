/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Entity.Coche;
import Servicio.CocheServicio;

/**
 *
 * @author gabyg
 */
public class CocheMain {
    public static void main(String[] args) {
        CocheServicio sv = new CocheServicio();
        Coche colection = new Coche();
        sv.menu(colection);
    }
}
