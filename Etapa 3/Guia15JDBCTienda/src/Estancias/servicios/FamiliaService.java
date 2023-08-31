/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estancias.servicios;

import Estancias.persistencia.FamiliasDAO;

/**
 *
 * @author gabyg
 */
public class FamiliaService {

    private FamiliasDAO dao;

    public FamiliaService(FamiliasDAO dao) {
        this.dao = dao;
    }

    //Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
    public void verificarFamilia() throws Exception {

        System.out.println("Lista de Familias con al menos 3 hijos y con edad maxima de 10 años.");
        try {
            dao.verificarFamilia();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
    public void verificarEmail() throws Exception {
        System.out.println("Familias cuya direccion de mail es Hotmail");
        try {
            dao.verificarEmail();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
