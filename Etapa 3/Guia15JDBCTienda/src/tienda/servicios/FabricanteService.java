/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.Scanner;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author gabyg
 */
public class FabricanteService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private FabricanteDAO dao;

    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }

    public void insertarFabricante() {
        System.out.println("Ingrese el nombre del fabricante");
        String nombre = sc.next();
        try {
            dao.ingresarFabricante(nombre);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
