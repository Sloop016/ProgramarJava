/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Entity.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author gabyg
 */
public class mainPersona {

    public static void main(String[] args) {
        PersonaServicio service = new PersonaServicio();
        Persona persona = service.crearPersona();
        service.mostrarPersona(persona);

    }
}
