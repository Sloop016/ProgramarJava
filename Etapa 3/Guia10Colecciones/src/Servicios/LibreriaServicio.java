/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class LibreriaServicio {

    Scanner sc = new Scanner(System.in);

    public void crearNuevoLibro(HashSet<Libro> libroHashSet) {
        boolean check = true;
        while (check) {
            Libro libro = new Libro();
            System.out.println("Ingrese el titulo:");
            libro.setTitulo(sc.nextLine());
            System.out.println("Ingrese el autor:");
            libro.setAutor(sc.nextLine());
            System.out.println("Ingrese el numero de ejemplares:");
            libro.setNumeroDeEjemplares(sc.nextInt());
            System.out.println("Ingrese el numero de ejemplares prestados:");
            libro.setNumeroDeEjemplaresPrestados(sc.nextInt());
            sc.nextLine();
            libroHashSet.add(libro);
            System.out.println("¿Desea crear otro libro? (s/n)");
            String respuesta = sc.next();
            check = respuesta.equalsIgnoreCase("s");
            sc.nextLine();
        }
    }

    public void prestamo(HashSet<Libro> libroHashSet) {
        System.out.println("Ingrese el titulo del libro que quiere pedir prestado:");
        String titulo = sc.nextLine();
        boolean prestado = false;
        for (Libro libro : libroHashSet) {
            if (libro.getTitulo().equals(titulo) && libro.getNumeroDeEjemplares() > 0
                    && libro.getNumeroDeEjemplaresPrestados() < libro.getNumeroDeEjemplares()) {
                libro.setNumeroDeEjemplaresPrestados(libro.getNumeroDeEjemplaresPrestados() + 1);
                prestado = true;
            }
        }
        if (prestado) {
            System.out.println("Libro prestado");
        } else {
            System.out.println("Libro no prestado");
            for (Libro libro : libroHashSet) {
                if (libro.getTitulo().equals(titulo)) {
                    System.out.println("Cantidad de ejemplares existentes: " + libro.getNumeroDeEjemplares());
                    System.out.println("Cantidad de ejemplares prestados: " + libro.getNumeroDeEjemplaresPrestados());
                    System.out.println("Cantidad actual disponible para prestar: " + (libro.getNumeroDeEjemplares()
                            - libro.getNumeroDeEjemplaresPrestados()));
                }
            }
        }
    }

    /* • Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
     * lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
     * El método decrementa de a uno, como un carrito de compras, el atributo
     * ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
     * vez que se produzca la devolución de un libro. No se podrán devolver libros
     * donde que no tengan ejemplares prestados. Devuelve true si se ha podido
     * realizar la operación y false en caso contrario.
     * • Método toString para mostrar los datos de los libros.
     */
    public void devolucion(HashSet<Libro> libroHashSet) {
        System.out.println("Ingrese el titulo del libro que va a devolver:");
        String titulo = sc.nextLine();
        boolean devuelto = false;
        for (Libro libro : libroHashSet) {
            if (libro.getTitulo().equals(titulo) && libro.getNumeroDeEjemplaresPrestados() > 0) {
                libro.setNumeroDeEjemplaresPrestados(libro.getNumeroDeEjemplaresPrestados() - 1);
                devuelto = true;
            }
        }
        if (devuelto) {
            System.out.println("Se pudo devolver el libro");
        } else {
            System.out.println("No se pudo devolver el libro");
        }
    }

    public void mostrarlibros(HashSet<Libro> libroHashSet) {
        for (Libro libro : libroHashSet) {
            System.out.println("Titulo: " + libro.getTitulo() + " / Autor: " + libro.getAutor());
            int disponibles = libro.getNumeroDeEjemplares() - libro.getNumeroDeEjemplaresPrestados();
            System.out.println("Disponibles para prestar :" + disponibles);
        }
    }
}
