/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotaapp.service;

import Entidad.Mascota;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class ServicioMascota {
    
    static Scanner sc = new Scanner(System.in);
    
    public Mascota crearMascota(){
        
        System.out.println("Ingrese el nombre");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese el apodo");
        String apodo = sc.nextLine();
        
        System.out.println("Ingrese el tipo");
        String tipo = sc.nextLine();
        
        return new Mascota(nombre, apodo, tipo);
        
    }
}
