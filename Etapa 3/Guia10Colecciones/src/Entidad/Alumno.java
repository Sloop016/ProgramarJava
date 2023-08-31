/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author gabyg
 */
public class Alumno {

    private String Nombre;
    private ArrayList<Integer> Notas = new ArrayList<>(3);

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        Nombre = nombre;
        Notas = notas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return Notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        Notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre="
                + Nombre + ", Notas="
                + Notas + '}';
    }

}
