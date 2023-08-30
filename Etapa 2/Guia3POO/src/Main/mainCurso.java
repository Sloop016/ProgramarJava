/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Entity.Curso;
import Servicio.CursoServicio;

/**
 *
 * @author gabyg
 */
public class mainCurso {
    public static void main(String[] args) {
        CursoServicio service = new CursoServicio();
        Curso grupo1 = service.crearCurso();
        service.resumenCurso(grupo1);
    }
}
