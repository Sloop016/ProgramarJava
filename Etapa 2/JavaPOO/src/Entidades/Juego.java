/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class Juego {

    private int numeroX;
    private int intentosMax = 0;
    private int cont = 0;

    
    // Constructor
    public Juego(int numeroX, int intentosMax) {
        this.numeroX = numeroX;
        this.intentosMax = intentosMax;
    }

    public void setNumeroX(int numeroX) {
        this.numeroX = numeroX;

    }
    // Getter y Setter
    public int getNumeroX() {
        return numeroX;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    
    // datos
    public void iniciar_juego(Juego juego) {
        Scanner sc = new Scanner(System.in);
        System.out.println("jugador 1 : Ingrese su numero ");
        numeroX = sc.nextInt();
        System.out.println("Jugador 2 adivina el numero secreto!");
        do {
            int num = sc.nextInt();
            if (num != juego.getNumeroX()) {
                juego.setCont(cont += 1);
            } else {
                System.out.println("Felicitaciones encontraste el numero del jugador 1");
            }
        } while (juego.getCont() < juego.getIntentosMax());
        System.out.println("Se te acabaron los intentos, Game Over!.");
    }
}