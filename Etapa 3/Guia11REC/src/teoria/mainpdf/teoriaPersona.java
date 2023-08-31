/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria.mainpdf;

import teoria.entidadpdf.Dni;
import teoria.entidadpdf.Persona;


/**
 *
 * @author gabyg
 */
public class teoriaPersona {

    public static void main(String[] args) {
        Persona persona = new Persona();
        Dni dni = new Dni();
        dni.setPersona(persona);
        dni.setLetra('x');
        dni.setNumero(111111);
    }
}
