/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Entity.NIF;
import Servicio.NIFservicio;

/**
 *
 * @author gabyg
 */
public class mainNIF {
    public static void main(String[] args) {
        
    
    NIFservicio sv = new NIFservicio();
    NIF n1 = new NIF();
    sv.crearNIF(n1);
    sv.mostrar(n1);
    
  }  
}
