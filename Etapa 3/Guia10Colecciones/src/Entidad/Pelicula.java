/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/*
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
 * tendremos una clase Pelicula con el título, director y duración de la película (en horas).
 */
public class Pelicula {
    private String titulo;
    private String director;
    private float duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, float duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return  " Titulo= " + titulo 
                + "| Director=" + director 
                + "| duracion=" + duracion;
    }
    
    
    
}
