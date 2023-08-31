/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Entidad.Alumno;
import Servicios.AlumnoServicio;
import java.util.ArrayList;

/**
 *
 * @author gabyg
 */
public class mainAlumno {

    public static void main(String[] args) {
        AlumnoServicio sv = new AlumnoServicio();
        ArrayList<Alumno> alumnos = new ArrayList<>();
        sv.crearAlumno(alumnos);
        sv.mostrarAlumnos(alumnos);
        sv.notaFinal(alumnos);
        sv.eliminarAlumno(alumnos);
        sv.mostrarAlumnos(alumnos);
        sv.modificarAlumno(alumnos);
        sv.mostrarAlumnos(alumnos);

    }
}
