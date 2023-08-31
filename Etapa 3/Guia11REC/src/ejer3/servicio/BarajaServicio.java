/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer3.servicio;

import ejer3.entidad.Cartas;
import ejer3.entidad.Palos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class BarajaServicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Palos> palos = new ArrayList();
    ArrayList<Cartas> cartas = new ArrayList();
    ArrayList<Cartas> cartasDadas = new ArrayList();
    
    public void crearPalos(){
        palos.add(new Palos ("Espadas"));
        palos.add(new Palos ("Bastos"));
        palos.add(new Palos ("Copas"));
        palos.add(new Palos ("Oros"));
    }
    
    public void crearBaraja() {
        crearPalos();
        if (cartas.size()<0) {
            System.out.println("Ya existe una baraja");
            
        }else {
            System.out.println("Creando baraja...");
            String[] numero = {"1", "2", "3", "4", "5", "6", "7", "10", "11", "12"};
                
            for (int i = 0; i < palos.size(); i++) {
                for (int j = 0; j < numero.length; j++) {
                    cartas.add(new Cartas(numero[j], palos.get(i)));
                }
            }
            System.out.println("La bajara se ha creado correctamente.");
        }
        
    }
    public void barajar() {
        System.out.println("Barajando...");
        Collections.shuffle(cartas);
        System.out.println("Se mezcló la baraja completamente!");
    }
    public Cartas siguienteCarta() {
        Cartas carta = new Cartas();
        if (cartas.isEmpty()) {
            System.out.println("No hay cartas");
        } else {
            carta = cartas.get(0);
        }
        return carta;
    }

    public void cartasDisponibles() {
        System.out.println("Entidad.Cartas disponibles: " + cartas.size());
    }

    public void darCartas() {
        System.out.println("Ingrese la cantidad de cartas que desea dar:");
        int cantidad = sc.nextInt();
        if (cantidad > cartas.size()) {
            System.out.println("No hay suficientes cartas");
        } else {
            int cont = 0;
            while (cont < cantidad) {
                System.out.println("Se dio la carta: " + siguienteCarta() + " al jugador");
                cartasDadas.add(cartas.get(0));
                cartas.remove(0);
                cont++;
            }
        }
    }

    public void cartasMonton() {
        System.out.println("Entidad.Cartas del monton: " + cartasDadas.size());
        for (Cartas carta : cartasDadas) {
            System.out.println(carta);
        }
    }

    public void mostrarBaraja() {
        System.out.println("Entidad.Cartas de la baraja:");
        for (Cartas carta : cartas) {
            System.out.println(carta);
        }
    }
}
