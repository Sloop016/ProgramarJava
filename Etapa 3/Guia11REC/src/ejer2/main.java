/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2;

import ejer2.entidad.Jugador;
import ejer2.entidad.Revolver;
import ejer2.servicio.RuletaServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        RuletaServicio ruletaService = new RuletaServicio();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Revolver revolver = new Revolver();
        System.out.println();
        ruletaService.llenarJuego(jugadores, revolver);
        System.out.println();
        System.out.println("Disparando: ");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("Posicion revolver: " + revolver.getPosActual() + "\nPosicion agua: " + revolver.getPosAgua());
            boolean muerto = !ruletaService.ronda(jugadores.get(i), revolver);
            System.out.println(jugadores.get(i).getNombre() + " Se dispara!");
            if (ruletaService.disparo(jugadores.get(i), revolver)) {
                System.out.println("El " + jugadores.get(i).getNombre() + " Murio (:'C)");
            } else {
                System.out.println("Sigue vivo!");
                System.out.println();
                ruletaService.siguienteChorro(revolver);
            }
            if (muerto) {
                break;
            }
        }
    }

}
