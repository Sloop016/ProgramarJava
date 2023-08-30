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
public class cancion {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public String autor;
    public String titulo;

    public cancion() {
    }
//---------------------------------------------------------------- 
// Constructor
//----------------------------------------------------------------   

    public cancion(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }
//----------------------------------------------------------------
// Getting y Setting    
//----------------------------------------------------------------

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

//----------------------------------------------------------------
// LECTURA 
//----------------------------------------------------------------
    public void lectura() {
        System.out.println("Ingrese el título y autor de la canciñon: ");
        System.out.println("Titulo:");
        titulo = sc.nextLine();
        System.out.println("Autor:");
        autor = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Cancion |" +" El titulo de la cancion es: " + titulo + ", y su Autor es: " + autor;
    }

}
