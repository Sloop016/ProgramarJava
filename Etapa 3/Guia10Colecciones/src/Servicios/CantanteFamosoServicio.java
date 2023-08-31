/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class CantanteFamosoServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<CantanteFamoso> listaCantante = new ArrayList<>();

    public void cantanteDesignados() {

    }

    public void agregarCantante(ArrayList<CantanteFamoso> lista) {
        String resp;
        do {

            CantanteFamoso cantante = new CantanteFamoso();
            System.out.println("Ingrese el nombre del cantante a agregar: ");
            cantante.setNombre(sc.nextLine());
            System.out.println("Ingrese el nombre del disco mas vendido: ");
            cantante.setDiscoConMasVentas(sc.nextLine());
            listaCantante.add(cantante);
            System.out.println("Desea ingresar otro CantanteFamoso? (S/N)");
            resp = sc.nextLine();
        } while (resp.equalsIgnoreCase("s"));
    }

    public void mostrarCantantes(ArrayList<CantanteFamoso> lista) {
        for (CantanteFamoso cantante : lista) {
            System.out.println(cantante);
        }
    }

    public void eliminarCantante(ArrayList<CantanteFamoso> lista) {
        System.out.println("Ingrese el nombre del cantante a eliminar:");
        String nombre = sc.nextLine();
        for (CantanteFamoso cantante : lista) {
            if (cantante.getNombre().equalsIgnoreCase(nombre)) {
                lista.remove(cantante);
                break;
            }
        }
    }
}
