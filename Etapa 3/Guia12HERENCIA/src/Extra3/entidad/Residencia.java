/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra3.entidad;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class Residencia extends Alojamiento {

    protected int habitaciones;
    protected boolean descuentos;
    protected boolean campoDeportivo;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Residencia(String residencia_1, String calle_Falsa_789, String santa_Fe, String anastacio, int par, boolean par1, boolean par2) {
    }

    public Residencia(int habitaciones, boolean descuentos, boolean campoDeportivo) {
        this.habitaciones = habitaciones;
        this.descuentos = descuentos;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencia(int habitaciones, boolean descuentos, boolean campoDeportivo, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.descuentos = descuentos;
        this.campoDeportivo = campoDeportivo;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public String toString() {
        return "Residencia{"
                + "habitaciones=" + habitaciones
                + ", descuentos=" + descuentos
                + ", campoDeportivo=" + campoDeportivo
                + ", nombre='" + nombre + '\''
                + ", direccion='" + direccion + '\''
                + ", localidad='" + localidad + '\''
                + ", gerente='" + gerente + '\''
                + '}';
    }

    public Residencia crearResidencia() {
        System.out.println("Ingrese el nombre de la residencia");
        this.nombre = sc.next();
        System.out.println("Ingrese la direccion de la residencia");
        this.direccion = sc.next();
        System.out.println("Ingrese la localidad de la residencia");
        this.localidad = sc.next();
        System.out.println("Ingrese el gerente de la residencia");
        this.gerente = sc.next();
        System.out.println("Ingrese la cantidad de habitaciones de la residencia");
        this.habitaciones = sc.nextInt();
        System.out.println("Ingrese si posee descuentos a los gremios");
        this.descuentos = sc.nextBoolean();
        System.out.println("Ingrese si posee campo de deportivo");
        this.campoDeportivo = sc.nextBoolean();
        return this;
    }
}
