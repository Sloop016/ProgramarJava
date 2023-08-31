/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import persistencia.AutorJpaController;

/**
 *
 * @author gabyg
 */
public class AutorService {
    
    AutorJpaController controladorAutor;

    public AutorService() {
        this.controladorAutor = new AutorJpaController();
    }
    
    
}
