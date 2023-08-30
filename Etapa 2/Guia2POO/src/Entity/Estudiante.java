/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;
/*Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
Crea un método en la clase de servicios para crear al estudiante, uno para 
mostrarlo y otro para mostrar por pantalla si el estudiante aprobó o no.*/
/**
 *
 * @author gabyg
 */
public class Estudiante {
    
    private String nombre;
    private int edad; 
    private double notaProm;
    private double teorico;
    private double practico;
    private double nfinal;
    

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, double notaProm, double teorico, double practico, double nfinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaProm = notaProm;
        this.teorico = teorico;
        this.practico = practico;
        this.nfinal = nfinal;
    }

    public double getTeorico() {
        return teorico;
    }

    public double getPractico() {
        return practico;
    }

    public double getNfinal() {
        return nfinal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaProm() {
        return notaProm;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTeorico(double teorico) {
        this.teorico = teorico;
    }

    public void setPractico(double practico) {
        this.practico = practico;
    }

    public void setNfinal(double nfinal) {
        this.nfinal = nfinal;
    }

    
    public void setNotaProm(double notaProm) {
        this.notaProm = notaProm;
    }

    @Override
    public String toString() {
        return "Estudiante:" 
                + "\nnombre: " + nombre 
                + "\nedad: " + edad 
                + "\nfinal: " + notaProm 
                + "\nteorico: " + teorico 
                + "\npractico: " + practico 
                + "\notaProm: " + notaProm;
    }


    
    
    
    
}
