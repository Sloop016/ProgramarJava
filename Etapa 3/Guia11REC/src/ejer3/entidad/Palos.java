/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer3.entidad;

/**
 *
 * @author gabyg
 */
public class Palos {
    private String nombre;

    public Palos() {
    }

    public Palos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Palos{" + "nombre=" + nombre + '}';
    }
    
    
}
