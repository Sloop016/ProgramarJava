/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

/**
 *
 * @author gabyg
 */
public final class FabricanteDAO extends DAO {

    public void ingresarFabricante(String nombre) throws Exception {
        try {
            String sql = "INSERT INTO fabricante (nombre) VALUES ('" + nombre + "')";
            conectarBase();
            sentencia = conexion.createStatement();
            insertarModificarEliminar(sql);
            System.out.println("Fabricante ingresado");
        } catch (Exception e) {
            throw e;
        }
    }

}
