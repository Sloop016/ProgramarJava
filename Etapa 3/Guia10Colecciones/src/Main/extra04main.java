/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Servicios.PostalesServicio;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class extra04main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> codPostales = new HashMap<>();
        PostalesServicio sv = new PostalesServicio();
        codPostales.put(1804, "Ezeiza," );
        codPostales.put(1801, "Cannning," );
        codPostales.put(1812, "Spegazzini," );

        int menu = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Ingresar tres Ciudades");
            System.out.println("2. Buscar Ciudad");
            System.out.println("3. Agregar una Ciudad");
            System.out.println("4. Eliminar tres Ciudades");
            System.out.println("5. Mostrar Ciudades");
            System.out.println("6. Salir");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    sv.cargarCodigos(codPostales);
                    break;
                case 2:
                    sv.buscarCodigo(codPostales);
                    break;
                case 3:
                    sv.cargarUnCodigo(codPostales);
                    break;
                case 4:
                    sv.eliminarCodigos(codPostales);
                    break;
                case 5:
                    sv.mostrarCodigos(codPostales);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (menu != 6);

    }
}
