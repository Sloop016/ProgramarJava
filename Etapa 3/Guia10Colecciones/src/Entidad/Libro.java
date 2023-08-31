/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author gabyg
 */
public class Libro {
    private String titulo;
    private String autor;
    private int numeroDeEjemplares;
    private int NumeroDeEjemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numeroDeEjemplares, int getNumeroDeEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.NumeroDeEjemplaresPrestados = getNumeroDeEjemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    public void setNumeroDeEjemplares(int numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    public int getNumeroDeEjemplaresPrestados() {
        return NumeroDeEjemplaresPrestados;
    }

    public void setNumeroDeEjemplaresPrestados(int numeroDeEjemplaresPrestados) {
        NumeroDeEjemplaresPrestados = numeroDeEjemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDeEjemplares=" + numeroDeEjemplares +
                ", getNumeroDeEjemplaresPrestados=" + NumeroDeEjemplaresPrestados +
                '}';
    }
}
