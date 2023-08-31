/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class RazaServicio {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearRaza(ArrayList<String> razas) {

        boolean conf = true;

        while (conf) {
            System.out.println("Ingrese una Raza de Perro: ");
            razas.add(sc.nextLine());
            System.out.println("Desea ingresar otra raza ? (s/n)");
            conf = sc.nextLine().equalsIgnoreCase("s");

        }
        mostrarRaza(razas);
    }

    public void mostrarRaza(ArrayList<String> razas) {
        System.out.println("Razas de perros :");
        for (String raza : razas) {
            System.out.println(raza);
        }
    }

    public void eliminarRaza(ArrayList<String> razas) {
        System.out.println("Ingrese la raza a eliminar:");
        String raza = sc.nextLine();
        Iterator<String> it = razas.iterator();
        boolean delete = false;
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equalsIgnoreCase(raza)) {
                it.remove();
                delete = true;
                
            }
        }
        if (delete) {
            System.out.println("Raza Eliminada.");
        }else {
            System.out.println("Raza no Encontrada.");
        }
        
        mostrarRaza(razas);
    }
}
