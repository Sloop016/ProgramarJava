/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import Ejercicio1.entidad.Animal;
import Ejercicio1.entidad.Caballo;
import Ejercicio1.entidad.Gato;
import Ejercicio1.entidad.Perro;

/**
 *
 * @author gabyg
 */
public class main {

    public static void main(String[] args) {
        // Declaracion perro
        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberman");
        perro1.alimentarse();
        // Declaracion otro perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarse();
        // Declaracion gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.alimentarse();
        // Declaracion perro
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();

    }
}
