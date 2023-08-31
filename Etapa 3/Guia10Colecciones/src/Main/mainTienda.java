/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Servicios.TiendaServicio;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class mainTienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TiendaServicio sv = new TiendaServicio();
        HashMap<String, Double> productos = new HashMap<>();
        int menu = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Promedio productos");
            System.out.println("6. Salir");

            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    sv.agregarProducto(productos);
                    break;
                case 2:
                    sv.modificarProducto(productos);
                    break;
                case 3:
                    sv.eliminarProducto(productos);
                    break;
                case 4:
                    sv.mostrarProductos(productos);
                    break;
                case 5:
                    sv.promedioProductos(productos);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (menu != 6);
    }
}
