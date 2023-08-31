/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Entidad.CantanteFamoso;
import Servicios.CantanteFamosoServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos
 * y tendrá como atributos el nombre y discoConMasVentas. Se debe, además, en el
 * main, crear una lista de tipo CantanteFamoso y agregar 5 objetos de tipo
 * CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada
 * cantante y su disco con más ventas por pantalla. Una vez agregado los 5, en
 * otro bucle, crear un menú que le de la opción al usuario de agregar un
 * cantante más, mostrar todos los cantantes, eliminar un cantante que el
 * usuario elija o de salir del programa. Al final se deberá mostrar la lista
 * con todos los cambios.
 *
 * @author gabyg
 */
public class extra02main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        CantanteFamosoServicio sv = new CantanteFamosoServicio();
        ArrayList<CantanteFamoso> lista = new ArrayList<>();
        lista.add(new CantanteFamoso("Tu piel", "Pure Negga"));
        lista.add(new CantanteFamoso("Lady Gaga", "Bad Romance"));
        lista.add(new CantanteFamoso("Beyonce", "Lemonade"));
        lista.add(new CantanteFamoso("Justin Bieber", "Baby"));
        lista.add(new CantanteFamoso("Lil Wayne", "Lil Wayne"));
        int menu = 0;
        do {
            System.out.println("1. Agregar cantante");
            System.out.println("2. Mostrar cantantes");
            System.out.println("3. Eliminar cantante");
            System.out.println("4. Salir");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    sv.agregarCantante(lista);
                    break;
                case 2:
                    sv.mostrarCantantes(lista);
                    break;
                case 3:
                    sv.eliminarCantante(lista);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (menu != 4);
        System.out.println();
        System.out.println("Lista Final");
        sv.mostrarCantantes(lista);
    }
}
