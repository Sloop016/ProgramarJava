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
public class CasasDAO extends DAO {

    public void mostrarCasas() throws Exception {
        try {
            String sql = "select * from casas where fecha_hasta >= '2020-08-01' AND fecha_desde <= '2020-08-31' and pais like 'Reino Unido'";
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                System.out.println(resultado.getString("calle")
                + "     " + resultado.getInt("numero"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
    
    
}
