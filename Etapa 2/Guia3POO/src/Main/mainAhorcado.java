/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Entity.Ahorcado;
import Servicio.AhorcadoServicio;
import java.util.Arrays;


/**
 *
 * @author gabyg
 */
public class mainAhorcado {
        public static void main(String[] args) {
        AhorcadoServicio service = new AhorcadoServicio();
        Ahorcado a = service.crearJuego();
        char[] palabra = new char[a.getPalabra().length];
        Arrays.fill(palabra, '*');

        do {
            service.juego(a, palabra);
        } while (a.getJugadasMax() != 0 && a.getLetrasEncontradas() != a.getLongitud());

        if (a.getJugadasMax() == 0) {
            System.out.println("Perdiste");
        }
        if (a.getLetrasEncontradas() == a.getLongitud()) {
            System.out.println("Ganaste");
        }
    }
}