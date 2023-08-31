/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2y3.Entidad;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class Televisor extends Electrodomestico {

    Scanner scn = new Scanner(System.in).useDelimiter("\n");
    protected int pulgadas;
    protected boolean tdt;

    public Televisor() {
    }

    public Televisor(Double precio, String color, Character consumoEnergetico, Double peso, int pulgadas, boolean tdt) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del televisor");
        pulgadas = scn.nextInt();
        System.out.println("Ingrese si tiene TDT (True/False)");
        tdt = scn.nextBoolean();
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (pulgadas < 40) {
            precio += precio * 0.3;
        }
        if (tdt) {
            precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Televisor{"
                + "pulgadas=" + pulgadas
                + ", tdt=" + tdt
                + ", precio=" + precio
                + ", color='" + color + '\''
                + ", consumoEnergetico=" + consumoEnergetico
                + ", peso=" + peso
                + '}';
    }

}
