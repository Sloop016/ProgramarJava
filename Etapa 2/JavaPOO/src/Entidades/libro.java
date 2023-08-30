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
public class libro {

    static Scanner sc = new Scanner(System.in);
    public String ISBN;
    public String Titulo;
    public String autor;
    public int numPag;

    public libro() {
    }

    public libro(String ISBN, String Titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public void libro() {
        System.out.println("Ingrese el nombre ISBN del Libro");
        ISBN = sc.next();
        System.out.println("Ingrese el nombre Titulo del Libro");
        Titulo = sc.next();
        System.out.println("Ingrese el nombre Autor del Libro");
        autor = sc.next();
        System.out.println("Ingrese el nombre numero de paginas del Libro");
        numPag = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Libro |= " + "ISBN: " + ISBN + ", Titulo:" + Titulo +", Autor: " + autor + ", Numero de Paginas: " + numPag;
    }
}
