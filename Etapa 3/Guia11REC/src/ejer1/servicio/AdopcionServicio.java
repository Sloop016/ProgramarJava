/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1.servicio;

import ejer1.entidad.Perro;
import ejer1.entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class AdopcionServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona:");
        persona.setNombre(sc.next());
        System.out.println("Ingrese el apellido de la persona:");
        persona.setApellido(sc.next());
        System.out.println("Ingrese la edad de la persona:");
        persona.setEdad(sc.nextInt());
        System.out.println("Ingrese el documento de la persona:");
        persona.setDocumento(sc.next());
        return persona;
    }

    public Perro crearPerro() {
        Perro perro = new Perro();
        System.out.println("Ingrese el nombre del perro:");
        perro.setNombre(sc.next());
        System.out.println("Ingrese la raza del perro:");
        perro.setRaza(sc.next());
        System.out.println("Ingrese la edad del perro:");
        perro.setEdad(sc.nextInt());
        System.out.println("Ingrese el tamaño del perro:");
        perro.setTamaño(sc.next());
        return perro;
    }
}
