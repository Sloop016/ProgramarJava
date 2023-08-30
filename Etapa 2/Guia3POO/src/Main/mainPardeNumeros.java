/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Entity.PardeNumeros;
import Servicio.PardeNumerosServicio;

/**
 *
 * @author gabyg
 */
public class mainPardeNumeros {
    public static void main(String[] args) {
        PardeNumerosServicio sv = new PardeNumerosServicio();
        PardeNumeros p1 = new PardeNumeros();
        sv.mostrarValores(p1);
        sv.devolverMayor(p1);
        sv.calcularPotencia(p1);
        sv.calcularRaiz(p1);
        
    }
}
