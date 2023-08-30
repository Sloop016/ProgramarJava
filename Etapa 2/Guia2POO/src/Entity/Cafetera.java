/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author gabyg
 */
public class Cafetera {

    public int cantMaxima;
    public int cantActual;

    public Cafetera() {

    }

    public Cafetera(int cantMaxima, int cantActual) {
        this.cantMaxima = cantMaxima;
        this.cantActual = cantActual;
    }

    public int getCantMaxima() {
        return cantMaxima;
    }

    public void setCantMaxima(int cantMaxima) {
        this.cantMaxima = cantMaxima;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "cantMaxima=" + cantMaxima + ", cantActual=" + cantActual + '}';
    }

}
