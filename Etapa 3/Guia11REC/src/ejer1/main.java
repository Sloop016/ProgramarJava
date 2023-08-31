/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1;

import ejer1.entidad.Perro;
import ejer1.entidad.Persona;
import ejer1.servicio.AdopcionServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        AdopcionServicio AdServicio = new AdopcionServicio();
        List<Persona> personas = new ArrayList();
        List<Perro> perrosAdop = new ArrayList();

        System.out.println("Ingresar cantidad de personas");
        int cantPerso = sc.nextInt();
        for (int i = 0; i < cantPerso; i++) {
            System.out.println("Entidad.Persona " + (i + 1) + ":");
            personas.add(AdServicio.crearPersona());
        }

        System.out.println("Cargar perros");
        int cantPerros = sc.nextInt();
        for (int i = 0; i < cantPerros; i++) {
            System.out.println("Entidad.perro " + (i + 1) + ":");
            perrosAdop.add(AdServicio.crearPerro());

        }
        System.out.println("");
        System.out.println("Adoptando Perros:");
        System.out.println("");

        for (Persona aux : personas) {
            System.out.println("Para la persona " + aux.getNombre() + " " + aux.getApellido()
                    + " \nseleccione el nombre de uno de los siguientes perros en adopción: ");

            for (Perro aux2 : perrosAdop) {
                System.out.println("Nombre: " + aux2.getNombre() + " - Raza: " + aux2.getRaza());
            }
            String adoptable = sc.next();
            int check = 0;
            for (int i = 0; i < perrosAdop.size(); i++) {
                if (adoptable.equalsIgnoreCase(perrosAdop.get(i).getNombre())) {
                    aux.setPerro(perrosAdop.get(i));
                    check++;
                    perrosAdop.remove(i);
                }
            }
            if (check == 0) {
                System.out.println("No se ah adoptado un perro valido.");
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Las siguientes personas han adoptado: ");
        for (Persona aux : personas) {
            if (aux.getPerro()== null) {
                System.out.println(aux.getNombre()+" "+aux.getApellido()+" No ha adoptado a ningun perro");
            }else{
                System.out.println(aux.getNombre()+" "+aux.getApellido() +" ah adoptado a "+aux.getPerro().getNombre()+" de Raza "+aux.getPerro().getRaza());
            }
                
        }
    }

}
