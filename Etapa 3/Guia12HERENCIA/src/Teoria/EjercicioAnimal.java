/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria;

import Teoria.entidad.ejercicioAnimal;
import Teoria.entidad.ejercicioGato;
import Teoria.entidad.ejercicioPerro;
import Teoria.interfaces.ejercicioTeoria;

/**
 *
 * @author gabyg
 */
public class EjercicioAnimal implements ejercicioTeoria {

    public static void main(String[] args) {
        ejercicioAnimal a = new ejercicioAnimal();
        a.hacerRuido();
        ejercicioAnimal b = new ejercicioPerro();
        b.hacerRuido();
        ejercicioAnimal c = new ejercicioGato();
        c.hacerRuido();

        // Interface
    }

    @Override
    public void accionX() {
        System.out.println("El Animal Realiza una accion");
    }
}
