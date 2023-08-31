/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra1.Entidades;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author gabyg
 */
public class Velero extends Barco {
    private int numMastiles;

    public Velero() {

    }

    public Velero(String matricula, double eslora, int anioFabricacion, int numMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }


    @Override
    public void totalAlquiler() {
        long diferencia = alquiler.getFechaDevolucion().getTimeInMillis() - alquiler.getFechaAlquiler().getTimeInMillis();
        long dias = TimeUnit.DAYS.convert(diferencia, TimeUnit.MILLISECONDS);
        System.out.println("Total Alquiler: " + (dias * (eslora + numMastiles) * 10));
    }

    @Override
    public String toString() {
        return "Velero{" +
                "numMastiles=" + numMastiles +
                ", matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioFabricacion=" + anioFabricacion +
                '}';
    }
}
