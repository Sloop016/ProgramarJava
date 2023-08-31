/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.Scanner;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author gabyg
 */
public class ProductoService {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
     private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }
    
    public void mostrarProducto1(){
        try {
            dao.mostrarProductos1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void mostrarProducto2(){
        try {
            dao.mostrarProductos1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public void mostrarProductos3() {
        try {
            dao.mostrarProductos3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void listarPortatiles() {
        try {
            dao.listarPortatiles();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void listarProductoMasBarato(){
    try {
        dao.listarProductoMasBarato();
    }catch (Exception e){
        e.printStackTrace();
    }
    }
    public void ingresarProducto(){
        try {
            System.out.println("Ingrese el nombre del producto:");
            String nombre = sc.next();
            System.out.println("Ingrese el precio del producto:");
            double precio = sc.nextDouble();
            System.out.println("Ingrese el codigo del fabricante:");
            int codigo_fabricante = sc.nextInt();
            dao.ingresarProducto(nombre,precio,codigo_fabricante);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void modificarProducto(){
        try {
            System.out.println("Ingrese la id del producto que desea modificar:");
            int id = sc.nextInt();
            System.out.println("Ingrese el nombre del producto:");
            String nombre = sc.next();
            System.out.println("Ingrese el precio del producto:");
            double precio = sc.nextDouble();
            System.out.println("Ingrese el codigo del fabricante:");
            int codigo_fabricante = sc.nextInt();
            dao.modificarProducto(id,nombre,precio,codigo_fabricante);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
