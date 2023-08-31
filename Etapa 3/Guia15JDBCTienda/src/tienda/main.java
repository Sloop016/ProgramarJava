/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import java.util.Scanner;
import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;

/**
 *
 * @author gabyg
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ProductoService ps = new ProductoService();
        FabricanteService fs = new FabricanteService();
       
        int menu = 0 ;
        do {            
            System.out.println("");
             System.out.println("1.Mostrar productos");
            System.out.println("2.Mostrar productos con precio ");
            System.out.println("3.Mostrar productos con precio entre X y X");
            System.out.println("4.Listar Portatiles");
            System.out.println("5.Listar producto mas barato");
            System.out.println("6.Ingresar producto");
            System.out.println("7.Ingresar Fabricante");
            System.out.println("8.Modificar producto");
            System.out.println("0.Salir");
             System.out.println();
            menu = sc.nextInt();
            
            switch (menu){
                case 1:
                    ps.mostrarProducto1();
                    break;
                case 2:
                    ps.mostrarProducto2();
                    break;
                case 3:
                    ps.mostrarProductos3();
                    break;
                case 4:
                    ps.listarPortatiles();
                    break;
                case 5:
                    ps.listarProductoMasBarato();
                    break;
                case 6:
                    ps.ingresarProducto();
                    break;
                case 7:
                    fs.insertarFabricante();
                    break;
                case 8:
                    ps.modificarProducto();
                    break;
                    case 0:
                        System.out.println("Hasta luego");
                    default:
                        System.out.println("Ingrese una opcion valida");
            }
        }while (menu != 0);
    }
}
