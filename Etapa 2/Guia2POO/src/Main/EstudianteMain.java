/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Entity.Estudiante;
import Servicio.EstudianteService;

/**
 *
 * @author gabyg
 */
public class EstudianteMain {
    public static void main(String[] args) {
        EstudianteService sv = new EstudianteService();
        Estudiante est = new Estudiante();
        sv.crearDatos();
        sv.mostrar(est);
    }
}
