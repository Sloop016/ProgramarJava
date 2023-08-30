/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entity.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class PersonaServicio {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    /*Método crearPersona que pida al usuario Nombre y 
    fecha de nacimiento de la persona a crear. 
    Retornar el objeto Persona creado.*/
    public Persona crearPersona() {

        System.out.println("Ingrese el nombre del Usuario");
        String nombre = sc.next();
        System.out.println("Ingrese la Fecha de nacimiento AAAA/MM/DD");
        int anio = sc.nextInt() - 1900;
        int mes = sc.nextInt() - 1;
        int dia = sc.nextInt();

        Date fechaNacimiento = new Date(anio, mes, dia);
        return new Persona(nombre, fechaNacimiento);
    }

    /*Método calcularEdad que calcule la edad 
    del usuario utilizando el atributo de fecha de 
    nacimiento y la fecha actual.*/
    public int calcularEdad(Persona persona) {
        Date fechaNacimiento = persona.getFechaNacimiento();
        Date actual = new Date();
        int anios = actual.getYear() - fechaNacimiento.getYear();
        if (fechaNacimiento.getMonth() > actual.getMonth()
                || (fechaNacimiento.getMonth() == actual.getMonth()
                && fechaNacimiento.getDate() > actual.getDate())) {
            anios--;
        }
        return anios;
    }

    /*Recibe como parámetro una Persona y una edad.
        Retorna true si la persona es menor que la edad consultada o false
        en caso contrario.*/
    public boolean menorQue(Persona persona, int edad) {
        return calcularEdad(persona) < edad;
    }

    /*Método mostrarPersona que muestra la información de la persona deseada.*/
    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad:");
        System.out.println(calcularEdad(persona));
        System.out.println("Ingrese una edad para ver si es menor de dicha edad:");
        int edadX = sc.nextInt();
        System.out.println(menorQue(persona, edadX));
    }
}
