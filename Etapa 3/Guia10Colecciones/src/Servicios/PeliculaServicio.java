/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class PeliculaServicio {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculas = new ArrayList<>();

    public void CrearPelicula() {
        boolean cont = true;
        while (cont) {
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingrese el titulo de la pelicula:");
            pelicula.setTitulo(sc.nextLine());
            System.out.println("Ingrese el director de la pelicula:");
            pelicula.setDirector(sc.nextLine());
            System.out.println("Ingrese la duracion de la pelicula:");
            pelicula.setDuracion(sc.nextFloat());
            sc.nextLine();
            peliculas.add(pelicula);
            System.out.println("Desea agregar otra pelicula? S/N");
            cont = sc.nextLine().equalsIgnoreCase("s");
        }

        peliculas.add(new Pelicula("HP - El Misterio del principe", "David Yates", (float) 2.33));
        peliculas.add(new Pelicula("Titanic", "James Cameron", (float) 3));
        peliculas.add(new Pelicula("A Funny Thing Happened on the Way to Thor's Hammer", "Clark Gregg", (float) 0.04));
    }

    public void mostrarPeliculas() {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void mostrarPelimas1Hr() {
        System.out.println("Peliculas con duracion menor a una hora: ");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() < 1) {
                System.out.println(pelicula);
            }
        }
    }
    // A partir de aca se utiliza una collection de comparacion  
    //Comparator<Obj> subObj = Comparator.comparing(Obj::atributoGetter)

    public void ordenPelimayamen() {
        Comparator<Pelicula> comp = Comparator.comparing(Pelicula::getDuracion);//objeto principal + funcion comparing de duraciones
        Collections.sort(peliculas, comp.reversed()); //comparator inverso + sort
        mostrarPeliculas();
    }

    public void ordenPeliMenoraMayor() {
        Comparator<Pelicula> comp = Comparator.comparing(Pelicula::getDuracion);//objeto principal + funcion comparing de duraciones
        Collections.sort(peliculas, comp); //sort comp
       Comparator<Pelicula> comp1 = Comparator.comparing(Pelicula::getDuracion);
        mostrarPeliculas();

    }

    public void ordenarPeliculasTitulo() {
        System.out.println("Peliculas por titulo de la A a la Z:");
        Comparator<Pelicula> comp = Comparator.comparing(Pelicula::getTitulo);
        Collections.sort(peliculas, comp);
        mostrarPeliculas();
    }

    public void ordenarPeliculasDirector() {
        System.out.println("Peliculas por director de la A a la Z:");
        Comparator<Pelicula> comp = Comparator.comparing(Pelicula::getDirector);
        Collections.sort(peliculas, comp);
        mostrarPeliculas();
    }
}
