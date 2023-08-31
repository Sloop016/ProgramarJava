/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import java.sql.SQLException;

/**
 *
 * @author gabyg
 */
public final class ProductoDAO extends DAO {


    public void mostrarProductos1() throws Exception {
        try {
            String sql = "SELECT * FROM producto";
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }

    public void mostrarProductos2() throws Exception {

        try {
            String sql = "SELECT * FROM producto";
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                System.out.println(resultado.getInt("codigo")
                        + "     " + resultado.getString("nombre")
                        + "     " + resultado.getDouble("precio"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
    //Listar aquellos productos que su precio esté entre 120 y 202.

    public void mostrarProductos3() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 and 202";

            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre") + "     " + resultado.getDouble("precio"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
    //d) Buscar y listar todos los Portátiles de la tabla producto.

    public void listarPortatiles() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%Portatil%'";
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre") + "     " + resultado.getDouble("precio"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
    //e) Listar el nombre y el precio del producto más barato.

    public void listarProductoMasBarato() throws Exception {
        try {
            String sql = "SELECT * FROM producto ORDER BY precio ASC LIMIT 1";
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre")
                        + "     " + resultado.getDouble("precio"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }

    //f) Ingresar un producto a la base de datos.
    public void ingresarProducto(String nombre, double precio, int codigoFabricante) throws Exception {
        try {
            String sql = "INSERT INTO producto (nombre, precio, codigo_Fabricante) VALUES ('" + nombre + "', " + precio + ", " + codigoFabricante + ")";
            conectarBase();
            sentencia = conexion.createStatement();
            insertarModificarEliminar(sql);
            System.out.println("Producto ingresado");
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }

    //h) Editar un producto con datos a elección.
    public void modificarProducto(int codigo, String nombre, double precio, int codigoFabricante) throws Exception {
        try {
            String sql = "UPDATE producto SET nombre = '" + nombre + "', precio = " + precio + ", codigo_Fabricante = " + codigoFabricante + " WHERE codigo = " + codigo;
            conectarBase();
            sentencia = conexion.createStatement();
            insertarModificarEliminar(sql);
            System.out.println("Producto modificado");
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }

    }
}
