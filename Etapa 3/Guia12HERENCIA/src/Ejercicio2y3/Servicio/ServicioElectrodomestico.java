/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2y3.Servicio;

import Ejercicio2y3.Entidad.Electrodomestico;
import Ejercicio2y3.Entidad.Lavadora;
import Ejercicio2y3.Entidad.Televisor;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class ServicioElectrodomestico {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Electrodomestico elec = new Electrodomestico();

    public void comprobarConsumoEnergico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            elec.getConsumoEnergetico(letra);
        } else {
            elec.setConsumoEnergetico(letra = 'F');

        }

    }

    public void comprobarColor(String color) {
        if (color.equalsIgnoreCase("blanco")
                || color.equalsIgnoreCase("negro")
                || color.equalsIgnoreCase("rojo")
                || color.equalsIgnoreCase("azul")
                || color.equalsIgnoreCase("gris")) {
            elec.getColor();
        } else {
            elec.setColor("blanco");
        }

    }

    public void crearElectrodomestico(char letra) {
        elec.setPrecio(1000.00);
        System.out.println("Ingrese el color del Electrodomestico");
        elec.setColor(sc.next());
        comprobarColor(elec.getColor());

        System.out.println("Ingrese el consumo del Electrodomestico");
        elec.getConsumoEnergetico(sc.next().toUpperCase().charAt(0));
        comprobarConsumoEnergico(elec.getConsumoEnergetico(letra));

        System.out.println("Ingrese el peso del Electrodomestico");
        elec.setPeso(sc.nextDouble());

    }

    public double precioFinal(char letra) {
        
        switch (elec.getConsumoEnergetico(letra)) {
            case 'A':
                elec.setPrecio(elec.getPrecio() + 1000);
                break;
            case 'B':
                elec.setPrecio(elec.getPrecio() + 800);
                break;
            case 'C':
                elec.setPrecio(elec.getPrecio() + 600);
                break;
            case 'D':
                elec.setPrecio(elec.getPrecio() + 500);
                break;
            case 'E':
                elec.setPrecio(elec.getPrecio() + 300);
                break;
            case 'F':
                elec.setPrecio(elec.getPrecio() + 100);
                break;

        }
        if (elec.getPeso() > 0 && elec.getPeso() < 20) {
            elec.setPrecio(elec.getPrecio() + 100);
        } else if (elec.getPeso() >= 20 && elec.getPeso() < 50) {
            elec.setPrecio(elec.getPrecio() + 500);
        } else if (elec.getPeso() >= 50 && elec.getPeso() < 80) {
            elec.setPrecio(elec.getPrecio() + 800);
        } else if (elec.getPeso() >= 80) {
            elec.setPrecio(elec.getPrecio() + 1000);

        }
        return elec.getPrecio();
    }

    //LAVADORA
    public Lavadora crearLavadora(char letra) {
        Lavadora lav = new Lavadora();

        crearElectrodomestico(letra);
        System.out.println("Ingrese la carga de la lavadora: ");
        lav.setCarga(sc.nextInt());
        precioFinal(letra);

        if (lav.getCarga() < 30) {
            lav.setPrecio(lav.getPrecio() + 500);
        }

        return lav;
    }

    //TELEVISOR
    public Televisor crearTelevisor(char letra) {
        Televisor tv = new Televisor();
        crearElectrodomestico(letra);
        System.out.println("Ingrese la cantidad de pulgadas del Televisor");
        tv.setPulgadas(sc.nextInt());
        System.out.println("Ingrese si la tv tiene TDT");
        tv.setTdt(sc.nextBoolean());
        precioFinal(letra);

        if (tv.getPulgadas() < 40) {
            tv.setPrecio(tv.getPrecio() * 0.3);
        }
        if (tv.isTdt()) {
            tv.setPrecio(tv.getPrecio() + 500);
        }

        return tv;
    }
}
