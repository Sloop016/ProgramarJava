/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Servicios.PaisesServicios;
import java.util.HashSet;

/**
 *
 * @author gabyg
 */
public class mainPaises {

    public static void main(String[] args) {
        
        PaisesServicios sv = new PaisesServicios();
        HashSet<String> paises = new HashSet<>();
        
        sv.agregarPaises(paises);
        sv.mostrarPaises(paises);
        sv.eliminarPaises(paises);
        sv.mostrarPaises(paises);
    }
}
