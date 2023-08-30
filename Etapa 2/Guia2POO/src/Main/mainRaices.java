/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Entity.Raices;
import Servicio.RaicesServicio;

/**
 *
 * @author gabyg
 */
public class mainRaices {
    public static void main(String[] args) {
        RaicesServicio sv = new RaicesServicio();
        Raices r = new Raices();
        sv.datos(r);
        sv.getDiscriminante(r);
        sv.tieneRaices(r);
        sv.tieneRaiz(r);
        sv.calcular(r);
    
    }
}
