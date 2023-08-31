/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra1.Entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class Alquiler {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private String documento;
    private Calendar fechaAlquiler;
    private Calendar fechaDevolucion;
    private String posAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, String documento, Calendar fechaAlquiler, Calendar fechaDevolucion, String posAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Calendar getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Calendar fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Calendar getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Calendar fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(String posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Alquiler alquiler(Barco barco) {
        System.out.println("Ingrese su Nombre:");
        this.nombre = sc.next();
        System.out.println("Ingrese su DNI:");
        this.documento = sc.next();
        System.out.println("Ingrese la fecha de Alquiler:(dia/mes/año)");
        int diaA = sc.nextInt();
        int mesA = sc.nextInt();
        int anioA = sc.nextInt();
        this.fechaAlquiler = new GregorianCalendar(anioA, mesA, diaA);
        System.out.println("Ingrese la fecha de Devolucion:(dia/mes/año)");
        int diaD = sc.nextInt();
        int mesD = sc.nextInt();
        int anioD = sc.nextInt();
        this.fechaDevolucion = new GregorianCalendar(anioD, mesD, diaD);
        System.out.println("Ingrese la Posicion del Amarre:");
        this.posAmarre = sc.next();
        this.barco = barco;
        return new Alquiler(nombre, documento, fechaAlquiler, fechaDevolucion, posAmarre, barco);
    }
}
