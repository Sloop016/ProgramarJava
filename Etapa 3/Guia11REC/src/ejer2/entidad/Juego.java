/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2.entidad;

import java.util.ArrayList;

/**
 *
 * @author gabyg
 */
public class Juego {
   
    private ArrayList<Jugador> jugadorList;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadorList, Revolver revolver) {
        this.jugadorList = jugadorList;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(ArrayList<Jugador> jugadorList) {
        this.jugadorList = jugadorList;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadorList=" + jugadorList + ", revolver=" + revolver + '}';
    }
    
    
}
