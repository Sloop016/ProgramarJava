/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entity.Estudiante;
import java.util.Scanner;

/*Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
Crea un método en la clase de servicios para crear al estudiante, 
uno para mostrarlo y otro para mostrar por pantalla si el estudiante aprobó o no.*/
/**
 *
 * @author gabyg
 */
public class EstudianteService {

    public Estudiante crearDatos() {
        Estudiante c1 = new Estudiante();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del Estudiante: ");
        c1.setNombre(sc.next());
        System.out.println("Ingrese la Edad del estudiante: ");
        c1.setEdad(sc.nextInt());
        System.out.println("ingrese las notas del estudiante (teorico, practico y final): ");
        c1.setTeorico(sc.nextDouble());
        c1.setPractico(sc.nextDouble());
        c1.setNfinal(sc.nextDouble());
        
            
        return c1;
    }
    public double mostrar (Estudiante c1){
        c1.setNotaProm((c1.getTeorico() + c1.getPractico() + c1.getNfinal())/3);
        System.out.println("el promedio es: " + c1.getNotaProm());
       return c1.getNotaProm();
    }
}
