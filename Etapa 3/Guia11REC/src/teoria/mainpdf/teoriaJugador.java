/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria.mainpdf;

import java.util.ArrayList;
import teoria.entidadpdf.Equipo;
import teoria.entidadpdf.Jugador;

/**
 *
 * @author gabyg
 */
public class teoriaJugador {
    public static void main(String[] args) {
        
    Jugador jugador1 = new Jugador();
    jugador1.setApellido("facha");
    jugador1.setNombre("pepe");
    jugador1.setNumero(11);
    jugador1.setPosicion("medio");
    ArrayList<Jugador> jugador = new ArrayList();
    jugador.add(jugador1);
    Equipo equipo = new Equipo();
    equipo.setJugador(jugador);

    
    }
}
