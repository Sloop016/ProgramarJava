/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import ejercicio1.ExceptionsPersona.ExceptionsPersona;
import ejercicio1.entidad.Persona;
import ejercicio1.servicio.PersonaServicio;

/**
 *
 * @author gabyg
 */
public class main {

    public static void main(String[] args) throws ExceptionsPersona {
        /**
         * Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8
         * Servicios, a null y tratar de invocar el método esMayorDeEdad() a
         * través de ese objeto. Luego, englobe el código con una cláusula
         * try-catch para probar la nueva excepción que debe ser controlada.
         */
        PersonaServicio personaServicio = new PersonaServicio();
//        Persona persona = null;
//        try {
//            personaServicio.esMayor(persona);
//
//        } catch (Exception e) {
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("***");
//        }
        try {
            personaServicio.crearPersona("juan",18);
        }catch (ExceptionsPersona e){
            System.out.println(e.getMessage());
        }
    }
}
