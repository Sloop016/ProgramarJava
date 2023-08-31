/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Entidad.Libro;
import Servicios.LibreriaServicio;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class extra03main {
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        LibreriaServicio libreriaService = new LibreriaServicio();
        HashSet<Libro> libroHashSet = new HashSet<>();

        libroHashSet.add(new Libro("El señor de los anillos", "J.R.R. Tolkien", 5, 2));
        libroHashSet.add(new Libro("El Quijote", "Miguel de Cervantes", 3, 3));
        libroHashSet.add(new Libro("Harry Potter", "J.K. Rowling", 4, 1));

        int menu = 0;
        do {
            System.out.println("1. Agregar libro/s");
            System.out.println("2. Pedir libro prestado");
            System.out.println("3. Devolver libro");
            System.out.println("4. Mostrar libros");
            System.out.println("5. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    libreriaService.crearNuevoLibro(libroHashSet);
                    break;
                case 2:
                    libreriaService.prestamo(libroHashSet);
                    break;
                case 3:
                    libreriaService.devolucion(libroHashSet);
                    break;
                case 4:
                    libreriaService.mostrarlibros(libroHashSet);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (menu != 5);


    }
}
