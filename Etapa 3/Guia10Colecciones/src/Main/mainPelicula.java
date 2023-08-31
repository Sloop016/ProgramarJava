/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Servicios.PeliculaServicio;

/**
 *
 * @author gabyg
 */
public class mainPelicula {
    public static void main(String[] args) {
        PeliculaServicio sv = new PeliculaServicio();
        
        sv.CrearPelicula();
        System.out.println("Peliculas: ");
        sv.mostrarPeliculas();
        System.out.println(" ");
        sv.mostrarPelimas1Hr();
        System.out.println(" ");
        sv.ordenPelimayamen();
        System.out.println(" ");
        sv.ordenPeliMenoraMayor();
        System.out.println(" ");
        sv.ordenarPeliculasTitulo();
        System.out.println(" ");
        sv.ordenarPeliculasDirector();
        System.out.println(" ");
        sv.mostrarPeliculas();
        
    }
}
