/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entity.NIF;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class NIFservicio {

    public void crearNIF(NIF nif) {

        System.out.println("Ingrese su DNI: ");
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        nif.setDNI(sc.nextLong());
        String buscaletra = "TRWAGMYFPDXBNJZSQVHLCKE";
        int i = (int) (nif.getDNI() % 23);
        nif.setLetra(buscaletra.charAt(i));

    }

    public void mostrar(NIF nif) {

        System.out.println("Su DNI es: " + nif.getDNI());
        System.out.println("Su NIF es: " + nif.getLetra());

        System.out.println("Como resultado: " + nif.getDNI() + "-" + nif.getLetra());
    }
}
