/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.servicio;

import ejercicio1.ExceptionsPersona.ExceptionsPersona;
import ejercicio1.entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class PersonaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public boolean esMayor(Persona p1) {
        return p1.getEdad() >= 18;
    }

    public Persona crearPersona(String nombre, int edad) throws ExceptionsPersona {
        Persona persona = new Persona();
        try {
            if (nombre.isEmpty()) {
                throw new ExceptionsPersona("Nombre no puede estar vacio!");
            }
            if (edad < 10) {
                throw new ExceptionsPersona("El Usuario no puede tener menos de 10 años!");
            }
        } catch (ExceptionsPersona e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionsPersona("Error");
        } finally {
            System.out.println("Se interrumpio la creacion de persona");
        }

        persona.setNombre(nombre);
        persona.setEdad(edad);

        return persona;

    }

    public Persona crearPersona() {
        Persona PC = new Persona();
        boolean s = false;
        System.out.println("Nombre:");
        PC.setNombre(sc.next());

        System.out.println("Ingresa tu edad");
        PC.setEdad(sc.nextInt());

        do {
            System.out.println("Ingresa tu sexo (H = Hombre, M = Mujer, O = Otro)");
            PC.setSexo(sc.next());
            if (PC.getSexo().equalsIgnoreCase("M") || PC.getSexo().equalsIgnoreCase("H") || PC.getSexo().equalsIgnoreCase("O")) {
                System.out.println("Es correcto");
                s = true;
            } else {
                System.out.println("Es incorrecto");
            }
        } while (!s);

        System.out.println("Ingresa tu peso");
        PC.setPeso(sc.nextFloat());

        System.out.println("Ingresa tu altura (en metros)");
        PC.setAltura(sc.nextFloat());

        return PC;
    }

    public int calcularIMC(Persona p1) {
        //kg/(altura^2)
        if (p1.getPeso() / (p1.getAltura() * p1.getAltura()) < 20) {
            System.out.println(p1.getNombre() + " esta por debajo de su peso ideal");
            return -1;
        } else if (p1.getPeso() / (p1.getAltura() * p1.getAltura()) >= 20 && p1.getPeso() / (p1.getPeso() * p1.getPeso()) <= 25) {
            System.out.println(p1.getNombre() + " esta en su peso ideal");
            return 0;
        } else {
            System.out.println(p1.getNombre() + " esta por encima de su peso ideal");
            return 1;
        }
    }
}
