/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class PostalesServicio {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");


    public void cargarCodigos(HashMap<Integer, String> codPostales) {
        System.out.println("Ingrese 3 ciudades con sus codigos postales:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese Cod Postal, luego la ciudad.");
            int cod = sc.nextInt();
//            sc.next();
            String ciudad = sc.next();
            codPostales.put(cod, ciudad);
        }


    }

    public void cargarUnCodigo(HashMap<Integer, String> codPostales) {
        System.out.println("Ingrese una ciudad con su codigo postal:");
        System.out.println("Ingrese Cod Postal, luego la ciudad.");
        int cod = sc.nextInt();

        String ciudad = sc.next();
        codPostales.put(cod, ciudad);


    }

    public void mostrarCodigos(HashMap<Integer, String> codPostales) {
        for (Map.Entry<Integer, String> cod : codPostales.entrySet()) {
            System.out.println(cod.getValue() + " " + cod.getKey());
        }

    }

    public void buscarCodigo(HashMap<Integer, String> codPostales) {
        System.out.println("Ingrese un codigo postal:");
        int codi = sc.nextInt();
        String ciudad = codPostales.get(codi);
        if (ciudad != null) {
            System.out.println("La ciudad es: " + ciudad);
        } else {
            System.out.println("No se encontró la ciudad.");
        }
    }

    public void eliminarCodigos(HashMap<Integer, String> codPostales) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un codigo postal a elimar:");
            int cod = sc.nextInt();
            boolean encontrada = false;
            if (codPostales.containsKey(cod)) {
                codPostales.remove(cod);
                encontrada = true;
            }
            if (encontrada) {
                System.out.println("Se elimino la ciudad.");
            } else {
                System.out.println("Ciudad no encontrada.");
            }

        }
    }


}
