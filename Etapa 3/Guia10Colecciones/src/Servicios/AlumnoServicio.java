/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class AlumnoServicio {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearAlumno(ArrayList<Alumno> alumnos) {

        String resp;

        do {
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = sc.next();
            ArrayList<Integer> Notas = new ArrayList<>();
            System.out.println("Ingrese las 3 notas del alumno: ");
            for (int i = 0; i < 3; i++) {
                Notas.add(sc.nextInt());
            }
            Alumno alumno = new Alumno(nombre, Notas);
            alumnos.add(alumno);
            System.out.println("Desea ingresar otro alumno ? (s/n)");
            resp = sc.next();
        } while (resp.equalsIgnoreCase("s"));

    }

    public void mostrarAlumnos(ArrayList<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public void notaFinal(ArrayList<Alumno> alumnos) {
        System.out.println("Ingrese el nombre del alumno a obtener promedio");
        String nombre = sc.next();
        int prom = 0;
        boolean check = false;
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                check = true;
                for (int nota : alumno.getNotas()) {
                    prom += nota;
                }
                System.out.println("El promedio del alumno es: " + prom / 3);
            }
        }
        if (!check) {
            System.out.println("No existe el alumno que busca.");
        }

    }

    public void eliminarAlumno(ArrayList<Alumno> alumnos) {
        System.out.println("Ingrese el nombre del alumno a Eliminar");
        String nombre = sc.next();
        boolean check = false;
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                alumnos.remove(i);
                check = true;
            }
        }
        if (check) {
            System.out.println("Alumno eliminado.");
        } else {
            System.out.println("Alumno no encontrado.");
        }

    }

    public void modificarAlumno(ArrayList<Alumno> alumnos) {
        System.out.println("Ingrese el nombre del alumno a modificar:");
        String nombre = sc.next();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Nuevo nombre");
                String nuevoNombre = sc.next();
                alumnos.get(i).setNombre(nuevoNombre);
            }
        }
    }

    public void modificarNota(ArrayList<Alumno> alumnos) {
        System.out.println("Ingrese el nombre del alumno a modificar:");
        String nombre = sc.nextLine();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Ingrese la posicion de la nota a modificar:");
                int posicion = sc.nextInt();
                System.out.println("Ingrese la nueva nota: ");
                int nota = sc.nextInt();
                alumnos.get(i).getNotas().set(posicion, nota);
            }
        }
    }

}
