/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estancias.persistencia;

import java.sql.SQLException;

/**
 *
 * @author gabyg
 */
public class FamiliasDAO extends DAO {

    //Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
    public void verificarFamilia() throws Exception {
        try {
            String sql = "select * from familias where num_hijos >= 3 and edad_maxima < 10";
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre") + "     " + resultado.getInt("num_hijos")
                        + "     " + resultado.getInt("edad_maxima"));

            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }

    //Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
    public void verificarEmail() throws Exception {

        try {
            String sql = "select * from familias where email like '%hotmail%'";
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre")
                        + "     " + resultado.getString("email"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
}
