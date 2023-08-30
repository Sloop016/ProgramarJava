/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class DateServicio {

    /*Método fechaNacimiento que pregunte al usuario día, 
    mes y año de su nacimiento. Luego los pase por 
    parámetro a un nuevo objeto Date. El método debe 
    retornar el objeto Date. Ejemplo fecha: 
    Date fecha = new Date(anio, mes, dia); */
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Date fechaNacimiento() {
        System.out.println("Ingrese su dia de nacimiento");
        int dia = sc.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int mes = sc.nextInt() - 1;
        System.out.println("Ingrese su año de nacimiento");
        int anio = sc.nextInt() - 1900;
        return new Date(anio, mes, dia);
    }

    public Date fechaActual() {
        /*que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();*/
        Date fechaActual = new Date();
        return fechaActual;
    }

    public void diferencia(Date fecha1, Date fecha2) {
        /*que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).*/
        System.out.print("Edad del usuario: ");
        System.out.print(Math.abs(fecha1.getDate() - fecha2.getDate()) + " Dias ");
        System.out.print(Math.abs(fecha1.getMonth() - fecha2.getMonth()) + " Mes/es ");
        System.out.print(Math.abs(fecha1.getYear() - fecha2.getYear()) + " Años ");

    }

    public int diferencia2(Date fechaNacimiento, Date fechaActual) {
        int anios = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaNacimiento.getMonth() > fechaActual.getMonth()
                || (fechaNacimiento.getMonth() == fechaActual.getMonth() && fechaNacimiento.getDate() > fechaActual.getDate())) {
            anios--;
        }
        return anios;
    }
}
