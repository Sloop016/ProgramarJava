/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotaapp;

import Entidad.Mascota;
import mascotaapp.service.ServicioMascota;

/**
 *
 * @author gabyg
 */
public class MascotaApp {

    public static void main(String[] args) {
        
        ServicioMascota mascota = new ServicioMascota();
        
        Mascota m1 = mascota.crearMascota();
        
        System.out.println(m1.toString());
        
        m1 = null;
        
    }
}
