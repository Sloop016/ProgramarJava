/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estancias.servicios;

import Estancias.persistencia.CasasDAO;

/**
 *
 * @author gabyg
 */
public class CasasService {

    private CasasDAO dao;

    public CasasService() {
        this.dao = new CasasDAO();
    }
    
    public void verificarCasas() {
        try {
            dao.mostrarCasas();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
