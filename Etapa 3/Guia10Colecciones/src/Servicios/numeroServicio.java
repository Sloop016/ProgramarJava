/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. Diseñar un programa que lea una serie de valores numéricos enteros desde
 * el teclado y los guarde en un ArrayList de tipo Integer. La lectura de
 * números termina cuando se introduzca el valor -99. Este valor no se guarda en
 * el ArrayList. A continuación, el programa mostrará por pantalla el número de
 * valores que se han leído, su suma y su media (promedio).
 *
 * @author gabyg
 */
public class numeroServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Integer> listaNumero = new ArrayList();

    public void agregarNum() {
        System.out.println("Ingrese una lista de numeros (-99 para terminar)");
        int numero = sc.nextInt();
        while (numero != -99) {
            listaNumero.add(numero);
            numero = sc.nextInt();
        }

    }

    public void mostrarNum() {
        System.out.println("Los numeros ingresados son: " + listaNumero);
    }

    public void sumaNum() {

        int suma = 0;
        for (int i = 0; i < listaNumero.size(); i++) {
            suma += listaNumero.get(i);
            
        }
        System.out.println("La suma de los numeros ingresados son: " + suma);
    }
    public void mostrarMedia(){
        int suma = 0 ;
        for (int i = 0; i < listaNumero.size(); i++) {
            suma+= listaNumero.get(i);
        }
        System.out.println("El promedio de los numeros es: " + suma/listaNumero.size());
    }
}
